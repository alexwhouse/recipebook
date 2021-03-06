package org.stairwaybook.scells

import scala.swing.Publisher
import scala.swing.event.Event

/**
 * Created by alexwhouse on 4/3/15.
 */
class Model(height: Int, width: Int) extends Evaluator with Arithmetic {
  val cells = Array.tabulate(height, width) { (h, w) => new Cell(h, w) }

  case class Cell(row: Int, column: Int) extends Publisher {
    private var v: Double = 0
    private var f: Formula = Empty

    override def toString = formula match {
      case Textual(s) => s
      case _ => value.toString
    }

    def value: Double = v

    def value_=(w: Double) {
      if (!(v == w || v.isNaN && w.isNaN)) {
        v = w
        publish(ValueChanged(this))
      }
    }

    def formula: Formula = f

    reactions += {
      case ValueChanged(_) => value = evaluate(formula)
    }

    def formula_=(f: Formula) {
      for (c <- references(formula)) deafTo(c)
      this.f = f
      for (c <- references(formula)) listenTo(c)
      value = evaluate(f)
    }
  }

  case class ValueChanged(cell: Cell) extends Event

}

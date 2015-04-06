package org.stairwaybook.gui.simplereactive

import scala.swing._
import scala.swing.event.EditDone

/**
 * Created by alexwhouse on 4/3/15.
 */
object FahrenheitConverter extends SimpleSwingApplication {
  override def top = new MainFrame {
    title = "Celsius/Fahrenheit Converter"

    object celsiusField extends TextField {
      columns = 5
    }

    object fahrenheitField extends TextField {
      columns = 5
    }

    contents = new FlowPanel {
      contents += celsiusField
      contents += new Label(" Celsius = ")
      contents += fahrenheitField
      contents += new Label(" Fahrenheit")
      border = Swing.EmptyBorder(15, 10, 10, 10)
    }
    listenTo(celsiusField, fahrenheitField)
    reactions += {
      case EditDone(`fahrenheitField`) =>
        val f = fahrenheitField.text.toInt
        val c = (f - 32) * 5 / 9
        celsiusField.text = c.toString
      case EditDone(`celsiusField`) =>
        val c = celsiusField.text.toInt
        val f = c * 9 / 5 + 32
        fahrenheitField.text = f.toString
    }
  }
}

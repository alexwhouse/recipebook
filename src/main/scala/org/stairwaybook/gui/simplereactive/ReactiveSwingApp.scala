package org.stairwaybook.gui.simplereactive

import scala.swing._
import scala.swing.event.ButtonClicked

/**
 * Created by alexwhouse on 4/2/15.
 */
object ReactiveSwingApp extends SimpleSwingApplication {
  override def top = new MainFrame {
    title = "Reactive Button"
    val button = new Button {
      text = "Click Me"
    }
    val label = new Label {
      text = "No button clicks registered"
    }
    contents = new BoxPanel(Orientation.Vertical) {
      contents += button
      contents += label
      border = Swing.EmptyBorder(30, 30, 30, 30)
    }
    listenTo(button)
    var nClicks = 0
    reactions += {
      case ButtonClicked(b) =>
        nClicks += 1
        label.text = "Number of button clicks: " + nClicks
    }
  }
}

package scalafx

import scalafx.application.JFXApp3
import scalafx.application.JFXApp3.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.effect.{DropShadow, Light, Lighting, Reflection}
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color.{Black, Cyan, DodgerBlue, PaleGreen, SeaGreen}
import scalafx.scene.paint.{LinearGradient, Stops}
import scalafx.scene.text.Text

object ScalaFXExample extends JFXApp3 {
  override def start(): Unit = {
    stage = new PrimaryStage {
      title = "ScalaFX Hello World"
      width = 650
      height = 450
      scene = new Scene {
        fill = Black
        content = new HBox {
          children = Seq(
            new Text {
              text = "Scala"
              style = "-fx-font-size: 100pt"
              fill = new LinearGradient(endX = 0, stops = Stops(PaleGreen, SeaGreen))
            },
            new Text {
              text = "FX"
              style = "-fx-font-size: 100pt"
              fill = new LinearGradient(endX = 0, stops = Stops(Cyan, DodgerBlue))
              effect = new DropShadow {
                color = DodgerBlue
                radius = 25
                spread = 0.25d
              }
            }
          )
          effect = new Reflection {
            fraction = 0.5d
            topOffset = -5.0d
            bottomOpacity = 0.75d
            input = new Lighting { light = new Light.Distant { elevation = 60 } }
          }
        }
      }
    }
  }
}
package scalafx

import scalafx.application.JFXApp3
import scalafx.application.JFXApp3.PrimaryStage
import scalafx.scene.paint.Color.Black

object FXMLExample extends JFXApp3:

  override def start(): Unit =
    val exampleScene = FXMLUtils.loadScene("FXMLExample")
    exampleScene.fill = Black
    stage = new PrimaryStage() {
      title = "ScalaFX Hello World"
      width = 650
      height = 450
      scene = exampleScene
    }

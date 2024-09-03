package scalafx

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import scalafx.scene.Scene
import scalafx.scene.SceneIncludes.*

object FXMLUtils :
  def loadScene(localPath: String): Scene =
    Scene(FXMLLoader.load[Parent](getClass.getResource(s"/$localPath.fxml")))

package scalajs

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

@main
def LiveChart(): Unit =
  renderOnDomContentLoaded(
    dom.document.getElementById("app"),
    Main.appElement()
  )

object Main:
  def appElement(): Element =
    div(h1("Hello Laminar!"))

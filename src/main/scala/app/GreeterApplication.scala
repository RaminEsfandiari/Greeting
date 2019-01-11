package app

import scala.io.StdIn

object GreeterApplication {

  def greet(name : String) : Unit = {

    if (name == "adam") {
      println(s"You don't get a hello!")
    }

    else if(name.startsWith("a") && name.endsWith("w") ) {
      println(s"Ey you Mr/Mrs/etc\n$name")
    }

    else {
      println(s"Hello $name")
    }
  }

  val name = StdIn.readLine("What is your name?\n")
  greet(name)

}


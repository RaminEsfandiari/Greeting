package app

object FizzBuzz extends App {

  var x : Int = 0

  while ( x < 100){
    x = x + 1

    if (x % 3 == 0 && x % 5 == 0){
      println("FizzBuzz")
    }
    else if (x % 3 == 0 || x.toString().contains("3")){
      println("Fizz")
    }
    else if (x % 5 == 0){
      println("Buzz")
    }
    else {
      println(x)
    }
  }

}

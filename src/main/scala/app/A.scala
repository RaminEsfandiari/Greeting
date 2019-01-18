package app

//
//trait A[T] {
//  def thingy: T
//}
//
//trait B[T, S <: T] {
//  def thingy: S
//}
//
//class C[T, S <: T] extends A[T] with B[T, S] {
//  override def thingy: S = ???
//}



trait A {

  def thingy: Any
}

trait B {

  def thingy: String
}

class C extends A with B {
  override def thingy: Nothing = throw new Exception
}
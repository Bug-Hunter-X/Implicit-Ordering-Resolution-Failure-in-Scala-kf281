```scala
import scala.math.Ordering

class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

object Main {
  implicit val stringOrdering: Ordering[String] = Ordering.by(_.length) //Custom ordering by length
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    val myString = new MyClass("hello")
    println(myInt.myMethod)
    println(myString.myMethod)
  }
}
```
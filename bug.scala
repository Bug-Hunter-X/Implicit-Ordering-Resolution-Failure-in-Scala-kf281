```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    val myString = new MyClass("hello")
    println(myInt.myMethod)
    println(myString.myMethod)
  }
}
```
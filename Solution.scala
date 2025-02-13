```scala
class MyClass[T](val value: T) {
  def myMethod(other: Any): Boolean = {
    this.value == other
  }
}

object Main extends App {
  val obj1 = new MyClass[Int](5)
  val obj2 = new MyClass[Int](5)
  val obj3 = new MyClass[String]("hello")
  val obj4 = new MyClass[String]("hello")
  println(obj1.myMethod(obj2)) // true
  println(obj3.myMethod(obj4)) // true
  println(obj1.myMethod(obj3)) // false
  println(obj1.myMethod(5)) //true
}
```
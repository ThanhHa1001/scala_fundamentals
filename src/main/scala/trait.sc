trait Description {
  def description: String
}

trait Coordinates extends Description {
  def x: Int
  def y: Int

  def description: String =
    "Coordinates (" + x + ", " + y + ")"
}

trait Area {
  def area: Double
}

class Rectangle(val x: Int, val y: Int, val width: Int, val height: Int)
  extends Coordinates with Description with Area {

  val area: Double = width * height

  override def description: String =
    super.description + " - Rectangle " + width + " * " + height
}

val rect = new Rectangle(x = 0, y = 3, width = 3, height = 2)
rect.description


trait A {
  def greet():Unit
}

trait B extends A {
  def greet(): Unit = println("Hello B!")
}

trait C extends A {
  def greet(): Unit = println("Hi C!")
}

class D extends B with C {
  override def greet(): Unit = {
    super[B].greet()
    super[C].greet()
  }
}

val d = new D()
d.greet()
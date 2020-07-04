class Shape(val x: Int, val y: Int) {
  val isAtOrigin: Boolean = x == 0 && y == 0
}

class Rectangle(x: Int, y: Int, val width: Int, val height: Int)
  extends Shape(x, y)

class Square(x: Int, y: Int, width: Int)
  extends Rectangle(x, y, width, width)

class Circle(x: Int, y: Int, val radius: Int)
  extends Shape(x, y)

val rect = new Rectangle(x = 0, y = 3, width = 3, height = 2)
rect.x
rect.y
rect.isAtOrigin
rect.width
rect.height


class A(x: Int, y: Int)

class A1(val x: Int, y: Int)
  extends A(x, y)






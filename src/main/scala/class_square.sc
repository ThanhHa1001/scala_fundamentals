class Robot

val nao = new Robot

val naoBis = nao
nao eq naoBis

val mii = new Robot
nao eq mii


class Rectangle(width: Int, height: Int) {
  val area: Int = width * height

  def scale(factor: Int): Rectangle = new Rectangle(width * factor, height * factor)
}

val square = new Rectangle(2, 2)
square.area

val square2 = square.scale(2)
square2.area

// Error:(24, 9) value width is not a member of Rectangle square2.width
// square2.width

// by default, constructor arguments are not accessible from the
// outside world. They are private to the instance and can only be accessed from
// the other members. If you want to make the constructor arguments accessible,
// you need to prefix them with val:
class RectangleNew(val width: Int, val height: Int) {
  val area: Int = width * height

  def scale(factor: Int): Rectangle = new Rectangle(width * factor, height * factor)
}

val rect = new RectangleNew(3, 2)
rect.area
rect.width
rect.height










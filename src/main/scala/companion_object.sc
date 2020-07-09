case class City(name: String, urbanArea: Int)
object City {
  val London = City("London", 1738)
  val Lausanne = City("Lausanne", 41)
}

case class Person(firstName: String, lastName: String, city: City)
object Person {
  def apply(fullName: String, city: City): Person = {
    val splitted = fullName.split(" ")
    new Person(firstName = splitted(0), lastName = splitted(1), city = city)
  }
}

// Uses the default apply method
val m1 = Person("Misaki", "Mei", City.London)
// Call apply with fullName
val m2 = Person("Misaki Mei", City.London)
// We can omit 'apply'
val n = Person.apply("Nicolas Jorand", City.Lausanne)

m1.city



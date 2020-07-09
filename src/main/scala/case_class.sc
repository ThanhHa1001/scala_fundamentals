case class Person(name: String, age: Int)

val thea = new Person("Thea", 25)
thea.name
thea.age

// 'new' is optional
val mahi = Person("mahi", 24)
mahi.name
mahi.age

val theaa = Person("Thea", 25)

// == compare values, not references
thea == theaa
// == is exactly the same as .equals
thea.equals(theaa)

val name = thea.name
// a case class is immutable. The line below does not compile:
// reassignment to val
// thea.name = "Mii"
//thea.name = "Mii"

// you need to create a new instance using copy
val mii = thea.copy(name = "Mii")
mii.name
mii.age

mii.equals(thea)















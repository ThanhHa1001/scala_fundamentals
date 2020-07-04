import scala.math.Equiv.Double

def agePeriod(age: Int): String = {
  if (age >= 65)
    "elderly"
  else if (age >= 40 && age < 65)
    "middle aged"
  else if (age >= 18 && age < 40)
    "young adult"
  else
    "child"
}

agePeriod(25)

// If sub-expressions have different types,
// the compiler will infer a common supertype, or widen the type if it is a numeric type:
val ifElseWiden = if (true) 2: Int else 2.0: Double

// the type of ifElseSupertype is Any, which is the common
//super-type for Int and String.
val ifElseSupertype = if (true) 2 else "2"


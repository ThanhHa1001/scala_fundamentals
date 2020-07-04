val x = println("hello")

def printName(name: String): Unit = println(name)

printName("Thea")

val y = {
  var a = 1
  a = a + 1
}

y

val z = ()

// Good practice: When a function with no parameters has side effects, you should declare it and
// call it with empty brackets (). It informs users of your function that it has side effects.
//  Conversely, a pure function with no parameters should not have empty brackets, and should
//  not be called with empty brackets. IntelliJ helps you in keeping some consistency: it will
//  display a warning if you call a parameterless function with (), or if you omit the () when you
// call a function declared with ().

// Here is an example of a method call with a side effect where we have to use
//empty brackets, and an example of a pure function:

def helloWorld(): Unit = println("Hello world")

helloWorld()

def helloWorldPure: String = "Hello world"

helloWorldPure

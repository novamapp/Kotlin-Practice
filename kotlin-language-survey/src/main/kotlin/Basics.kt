class Basics {
    // Unit return type = void
    fun printAll() : Unit {
        val num1 = 20
        println("Increment $num1 = ${increment(num1)} ")
        sampleConditionals()
        sampleForLoop()
        sampleWhileLoop()
        sampleWhen()
    }

    // functions can be an expression; return type can be inferred
    fun increment(numA: Int) = numA + 1

    fun sampleConditionals() {
        val num1 = 10
        // can declare variable without initializing it as long as type is given
        val str: String
        // basic if/else
        if (num1 <= 15) { println("$num1 is less than or equal to 15") }
        else { println("$num1 is greater than 15") }

        // if can be used as an expression
        str = if (num1 == 10 ) "num1 equals 10" else "num1 does not equal 10"
        println(str)
    }

    fun sampleForLoop() {
        // print items in collection by item
        val colors = listOf("Red", "Green", "Blue")
        for (color in colors) { print("$color ") }
        println()

        // print item in collection with indices
        for(index in colors.indices) {
            print("${colors[index]} is index = $index | ")
        }
        println()
    }

    fun sampleWhileLoop() {
        val names = listOf("Sam","John","Bren")
        var index = 0
        while(index < names.size) {
            print("${names[index]} ")
            index++
        }
        println()
    }

    fun sampleWhen() {
        val x: Any = 3
        val output = when(x) {
            "random" -> "some string"
            3 -> "some number"
            false -> "some boolean"
            else -> "unknown"
        }
        println("$x is $output")
    }
}

// class properties
// classes can be listed in declaration as well as body
// default constructor that mirrors declaration automatically created
// classes are final by default; have to use open parameter to make inheritable
open class Person(var lastName: String, var title: String) {}

class Teacher(lastName: String) : Person(lastName, title = "Teacher") {}
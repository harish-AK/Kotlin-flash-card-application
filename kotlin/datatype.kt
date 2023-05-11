fun main() {

    val number = 5
    println("Data type of number: " + number::class.simpleName)

    val marks1 = 56.9
    println("Data type of marks1: " + marks1::class.simpleName)

    val name = "Kotlin"
    println("Data type of name: " + name::class.simpleName)

// Integer Constant
    val byte: Byte = 1
    val short: Short = 1
    val int: Int = 1
    val long: Long = 1

    val normalNumber = 1
    val explicitlyMarkedLong = 1L
    val longByRange = 100000000000

    println("Data type of normalNumber is: " + normalNumber::class.simpleName)
    println("Data type of explicitlyMarkedLong is: " + explicitlyMarkedLong::class.simpleName)
    println("Data type of longByRange is: " + longByRange::class.simpleName)

//Floating POint

    val marks: Float = 1.0f
    val percentage: Double = 1.0


// Characters

    val letter: Char = 'p'

//    val letter: Char = 65     // Error
// Booleans

    val isQualified: Boolean = true
    val isPromoted: Boolean = false
}
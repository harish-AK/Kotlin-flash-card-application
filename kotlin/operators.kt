fun main()
{

// Arithmetic Operators
    var num1: Int = 25
    var num2: Int = 6

    println("Sum: " + (num1 + num2))
    println("Difference: " + (num1 - num2))
    println("Multiplication: " + (num1 * num2))
    println("Division: " + (num1 / num2))
    println("Modulus: " + (num1 % num2))

// Comparison Operators
    println("Less than: " + (num1 < num2))
    println("Greater than: " + (num1 > num2))
    println("Less than or equal to: " + (num1 <= num2))
    println("Greater than or equal to: " + (num1 >= num2))

// Assignment Operators

    var addAndAssign: Int = 0
    addAndAssign += num1
    println(addAndAssign)

    var subAndAssign: Int = 40
    subAndAssign -= num1
    println(subAndAssign)

    var multiplyAndAssign: Int = 1
    multiplyAndAssign *= num1
    println(multiplyAndAssign)

    var divideAndAssign: Int = 50
    divideAndAssign /= num1
    println(divideAndAssign)

    var modulusAndAssign: Int = 30
    modulusAndAssign %= num1
    println(modulusAndAssign)

//Equality operators
    println(num1 == num2)
    println(num1 != num2)

    num2 = num1
    println(num1 === num2)
    println(num1 !== num2)

//Unary operators
    println("+num1 :"+ +num1)
    println("-num2 :"+ -num2)
    println("++num1 :"+ ++num1)
    println("--num2 :"+ --num1)

    // Logical operators
    var andResult = num1 > 0 && num2 > 0
    var orResult = num1 > 0 || num2 > 0
    var notResult = !true
    println("Check if both are positive: " + andResult)
    println("Check if either one is positive: "+ orResult)
    println("Not operator on true: "+ notResult)

}

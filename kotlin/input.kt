import  java.util.*
fun main()
{
    // print and println
    print("Hello")
    print("World ")


    println("Kotlin")
    print("Programming")
    print(" Language")

    var number=1234
    var name='A'

    println("Number is : "+ number)
    println("Char is : "+ name)

    println("Number is : $number")
    println("Char is : $name")

    // Input methods
    println("Enter String:")
    var inputstring= readLine()
    println("Input string is : $inputstring")

    println("Enter the integer constant :")
    var inputnumber=Integer.valueOf(readLine())
    println("Input Integer constant is : $inputnumber")

    // Scanner Class
    var scanner =Scanner(System.`in`)
    println("Enter the Integer constant: ")
    var inputnumber1=scanner.nextInt()
    println("Input Integer constant is : $inputnumber1")

    println("Enter the double value: ")
    var inputnumber2=scanner.nextDouble()
    println("Input Double value is : $inputnumber2")

}
open class Calculator {
    //Name class as open to inherit it otherwise it is considered as final class
    fun add(num1: Int, num2: Int) {
        println(num1 + num2)
    }//for function use fun
}

open class Cal1 : Calculator() {
    //Inheritance
    var name2="Python"//State
    //Behaviour
    fun sub(num1: Int, num2: Int):Int {//To return we have to give the return data type
        return num1 - num2
    }
}

class Cal2 : Cal1(){
    fun mul(num1: Int,num2: Int):Int{
        return num1*num2
    }
}

fun main(args: Array<String>) {
    println("Hello World!")
    var name: String
    name = "Kotlin"
    println(name)
    //It is statically typed code so either we need to initialize the code or give data type
    val name1 = "Java"
    println(name1)
    //Here val cannot be reinitialize
    var obj1 = Cal2()
    println(obj1.name2)
    obj1.add(8, 11)
    println(obj1.sub(5, 6))
    println(obj1.mul(5,5))
}
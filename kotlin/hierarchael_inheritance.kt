open class hierarchael_inheritance {
    fun add()
    {
        println("now in parent class")
    }
}

class Call:hierarchael_inheritance(){
    fun mul()
    {
        println("now in child class")
    }

}
class Call2:hierarchael_inheritance(){
    fun div()
    {
        println("now in child class")
    }

}



fun main()
{
    var obj1=Call()
    var obj2=Call2()
    println("Child class one object")
    obj1.mul()  // child class method
    obj1.add()  // parent class method


    println("Child class two object")
    obj2.div()
    obj2.add()
}
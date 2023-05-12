open class method_overriding {
    open fun display(){
        println("Now in SRIHER Campus")
    }
}
class SRET:method_overriding()
{
    override fun display(){
        println("Now in SRET Campus")
    }
}

//method overriding  - same method from parent class can be used in different child class when its inherits the parent class.
fun main()
{
    var obj1=SRET()
    obj1.display()

}
////function with return type
//fun main()
//{
//    println(" X power 3 is:" +{xpower3(3)})
//}
//
//fun xpower3(number:Int):Int{
//    return number*number*number
//}
//
//
////function with no return type
//fun main()
//{
//    xpower3(3)
//}
//
//fun xpower3(number:Int){
//    println("X power 3 is: " + number*number*number)
//}

//Function with Unit return type - similar to void in java
//fun main()
//{
//    xpower3(3)
//}
//
//fun xpower3(number:Int):Unit{
//    println("X power 3 is: " + number*number*number)
//}

//Function with Nothing return type - never return anything
//fun main()
//{
//    xpower3(3)
//}
//
//fun xpower3(number:Int):Nothing{
//    println("X power 3 is: " + number*number*number)
//}

//Function with void
fun main()
{
    xpower3()
}
fun xpower3():Void?{
    println("This function has return type as void")
    return null
}

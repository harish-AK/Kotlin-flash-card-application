fun main()
{
    val range =1..9
    val range1=1.rangeTo(9)
    val lowerc='a'..'z'
    val upperc='A'..'Z'

    if( 2 in range)
        println("2 is in $range")
    if(8 in range1)
        println("8 is in $range1")

    // step
    println("step")
    val range2=1..10 step 2
    for(number in range2)
        println(number)

    //downTo
    println("downTo")
    val range3=10 downTo 1
    for(num in range3)
        println(num)

    // downTo and step
    println("downTo and Step ")
    val range4=10 downTo 1 step 3  //similar to for loop in python
    for(num1 in range4)
        println(num1)
}

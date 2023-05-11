fun main()
{
    //Integer Array
    val marks = arrayOf(10,5,6,7,9,23)
    println("index of 4 : "+marks[4])
    // Different Type of data
    val differentarray= arrayOf(10,4,5,"Hello",'P',10.45,123.5f)
    //fix the type of elements
    val marks1= arrayOf<Int>(10,8,20,30,50)

    val intarray= intArrayOf(1,2,3,4,5)
    val chararray= charArrayOf('a','b','c')
    var bytearray= byteArrayOf(1,2,3,4)
    var shortarray= shortArrayOf(2,3,4,8)
    var longarray = longArrayOf(590,456,678)
    var doubleary= doubleArrayOf(10.0,5.6,7.8)
    var floatary= floatArrayOf(10.0f,45.6f,67.9f)
    var booleanary= booleanArrayOf(true,false,true)

    // Declare the Array with Array class

    var marks21=Array(4,init={i -> i*4 })          // ([0]=0,[1]=4,[2]=8,[3]=12)

    // get() and set()
    val aryone= arrayOf<Int>(89,67,34,76,90,100)
    println("aryone.get method "+aryone.get(3))
    aryone.set(3,150)
    println("aryone.set method "+aryone.get(3))
    // Array Size
    println("size of array "+aryone.size)

    for((index,i) in aryone.withIndex())   //iteration 1 - i=0     I2 - i=1   I3 - i=2
        println("$index:$i")

}



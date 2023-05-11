fun main()
{
    val marks= arrayOf(89,34,78,56,45,23,10)

    for(index in marks)                      // Iteration 1 = index
    {
        println(index)
    }
    for(index in marks.indices)                      // Iteration 1 = index
    {
        println(" Marks in $index is:" + marks[index])
    }
}

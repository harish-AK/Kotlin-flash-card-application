fun main()
{
    var name: String = "Kotlin"           //name= "Kotlin"
    name="java vs Kotlin"                          // name= "Java"
    println(name)

    println("Lenght : ${name.length}")
    println("Last Index: ${name.lastIndex}")

    println("Char at index 3: ${name.get(3)}")
    println("Char at first: ${name.first()}")
    println("Char at last: ${name.last()}")

    println(" Add programming to the given string: ${name.plus(" Programming")}") //name.plus add char at end of string.
    println(" Subsequence : ${name.subSequence(0,10)}") //subsequence - to print specified number of chars

    println("Contains : ${name.contains("Java")}")

    println("Capitalize : ${name.capitalize()}")
    println("DeCapitalize : ${name.decapitalize()}")


    println("Reverse     ${name.reversed()}")

    println("Lower case : ${name.toLowerCase()}")
    println("Upper Case : ${name.toUpperCase()}")


    // String template

    var message= " Hello"
    var mlinestring ="""   Adding message in
        |                  multiple Line 
        |                  Comment 
        |                  $message
    """
    println(mlinestring)
}


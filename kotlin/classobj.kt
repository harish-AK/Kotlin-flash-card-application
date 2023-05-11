open class classobj {  //parent class should declare with the keyword called open
    fun meth(){
        println("parent ")
    }
}
class child:classobj(){
    fun meth2(){
        println("child")
    }
}
fun main(){
    var bj=child()
    bj.meth2()
    bj.meth()
}
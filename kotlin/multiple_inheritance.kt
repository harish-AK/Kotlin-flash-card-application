 open class Multiple_inheritance {
    fun parent(){
        println("parent ")
    }
}
 open class parent2:Multiple_inheritance(){
     fun parent2(){
         print("inherit parent")
     }
 }
 class children:parent2(){
     fun child(){
         println("children inherits two parents")
     }

 }
 fun main(){
     var chi=children()
     chi.parent()
     chi.parent2()
     chi.child()
 }
class class_and_objs {
    var brand:String=""
    var model:String =""
    var price:Float=0f
    var discount:Float=0F

    fun finalprice():Float{
        return price-discount
    }

    fun display(){
        println("Brand: $brand")
        println("Model : $model")
        println("price  : $price")
        println("Discount : $discount")
    }
}
fun main()
{

    var mobile=class_and_objs()
    mobile.brand="Vivo"
    mobile.model="1145"
    mobile.price=12000f
    mobile.discount=1200f

    println("Discounted Price is : ${mobile.finalprice()}")

    mobile.display()
}
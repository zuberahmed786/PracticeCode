data class DataClass(var product :String,var price:Int) {
    // Data class like getter and setter
    fun show()
    {
        println("Show price..")
    }
}
fun main()
{
    var obj1 = DataClass("HP",200)
    var obj2 = DataClass("HP",1000)
    println(obj1.copy("Dell"))
    println(obj2)
}
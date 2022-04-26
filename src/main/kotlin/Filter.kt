class Filter {
}
fun main(args:Array<String>)
{
    // list to filter the values
    val num = listOf(1,2,3,4,5)
//    val list = num.filter { it % 2 !=0 }
//    println(list)

    var add = listOf(Value(1,"zuber"),
    Value(2,"ahmed"),
    Value(3,"khan"))
    println(add.filter { it.id==1 })

    // foreach loop
    num.forEach{ println(it) }

    //code to convert values to paidUsers

    var paiduser = add.map { Paiduser(1,"khanam","idea") }
    println(paiduser)

}
// class for filter
data class Value(val id:Int,var name:String)

//class for map
data class Paiduser(val id:Int,var name :String, val type:String)
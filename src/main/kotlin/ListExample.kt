data class ListExample (var name :String ,var age :Int){

}
fun main(args : Array<String>)
{
    var values = listOf<ListExample>(ListExample("zuber",23),ListExample("ahmed",34))
    for (item in values)
    {
        println(item)
    }
}

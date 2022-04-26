import java.lang.Double.*


class HigherFun {


}
fun main(args : Array<String>)
{
   var fn = ::sum
    sum(34.5,54.5)
    println(calculator(34.3,4.7,fn))
}
fun calculator(a: Double,b: Double,gn:(a:Double,b:Double)->Double)
{
    val result = a+b+gn(a,b)
    println(result)
}
fun sum(a: Double,b: Double):Double
{
    return a+b
}
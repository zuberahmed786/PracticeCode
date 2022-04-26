fun main()
{
  var innerClass = InnerClass()
    innerClass.varar(1,2,34,4)
    innerClass.varar(1,2,3,4,54,766,767)
}
class InnerClass
{
    fun varar(vararg a:Int)
    {
        var sum=0
        for (i in a)
        {
            sum += i
        }
        println(sum)
    }
}
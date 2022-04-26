import java.math.BigInteger
interface MyClass
{
 fun first()
 fun run()
 {
     println("method body A")
 }
}
interface B
{
    fun b()

    fun run()
    {
        println("method body B")
    }
}
class C : MyClass,B{
    override fun first() {
        println("A is executing....")
    }
    override fun b() {
        println("b is executing....")
    }
    override fun run()
    {
        super<B>.run()
    }
}


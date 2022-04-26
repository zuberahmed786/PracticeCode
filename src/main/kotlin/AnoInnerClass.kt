interface AnoInnerClass {

    fun think()
}

fun main(args : Array<String>)
{
    var programmer : AnoInnerClass = object : AnoInnerClass
    {
        override fun think() {
            println("thinking")
        }
    }
    programmer.think()
}
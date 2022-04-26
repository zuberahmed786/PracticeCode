class Companion {
    companion object
    {
        fun get()
        {
            println("this is main companion")
        }
    }
}
fun main(args :Array<String>)
{
   Companion.get()
}
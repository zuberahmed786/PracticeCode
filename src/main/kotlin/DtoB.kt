class DtoB {
    fun arr(array: Array<Int>)
    {
        var sb = StringBuilder()
        for (i in array.iterator())
        {
            var num = Integer.toBinaryString(i)
            println("binary of $i is :$num")
        }
    }
}
fun main()
{
    val dtob= DtoB()
    dtob.arr(arrayOf(1,3,15))
}


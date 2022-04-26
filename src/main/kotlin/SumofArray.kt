class SumofArray {
}
fun sumofArray()
{
    var sum=0
    var array = arrayOf(2,6,3,7,9,8,9,8,2)
    for (i in array.iterator())
    {
        if (array.indexOf(i)%2==0)
        {
            sum += i

        }
    }
    println("Sum of Money is $sum")
}
fun main()
{
    sumofArray()
}
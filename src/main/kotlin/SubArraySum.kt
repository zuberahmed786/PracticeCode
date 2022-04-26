class SubArraySum {
}
fun suarraySum(array: Array<Int>,sum:Int)
{
    var add =0
    for (i in 0.. array.size)
    {
        for (j in i..array.size)
        {
            add += j
            if(add==sum)
            {
                println("1st is $i and 2nd is $j")

            }
            else
            {
                println("No subArray Found")
            }
        }

    }
}
fun main()
{
    suarraySum(arrayOf(1,2,4,5,6,6),6)
}
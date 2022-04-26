class PeakEle {
    fun peakornot(array: Array<Int>,size:Int)
    {
           var count =0
           for (i in 1..size)
           {
               if (array[i]>array[i-1])
               {
                   count++
               }
           }
        println("Output is $count")
        }
    }
fun main()
{
    val peakEle = PeakEle()
    peakEle.peakornot(arrayOf(1,2,2,4,3,8,9),6)
}
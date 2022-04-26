
fun main()
{
    val array = arrayOf(4,6,3,7,8,6)
    val obj = Problem1()
    println( obj.search(array))
}
class Problem1 {
    fun search(array: Array<Int>) : Int {
        var max = array[0]
        for (num in 1 until array.size) {
            if (array[num]<max)
            {
                max = num
            }
        }
      return max
    }
}
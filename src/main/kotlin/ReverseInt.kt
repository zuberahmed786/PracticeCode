class ReverseInt {
}
fun reverse() {
    var num :Int=123
    val sb=StringBuilder()
    while (num>0)
    {
        var add =0
        val remainder = num%10
        add = (add*10)+remainder
        num /= 10
        sb.append(add)
    }
     println( println(sb))
}
fun main()
{
    reverse()
}
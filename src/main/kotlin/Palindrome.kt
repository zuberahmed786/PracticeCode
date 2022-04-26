import java.util.Scanner

class Palindrome {
}
fun palindrome()
{
//    var reader = Scanner(System.`in`)
    var input = 45345
    var sum = 0
    var value: Int
    val temp = input
    while (input!=0)
    {
        value = input%10
        sum = (sum*10)+value
    }
    if(temp==sum)
    {
        println("Palindrome")
    }
    else
    {
        println("Not Palindrome")
    }
}
fun main()
{
    palindrome()
}
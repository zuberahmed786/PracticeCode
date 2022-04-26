import java.util.Scanner
fun fizzBuzz()
{
    println("Enter number")
    val  reader = Scanner(System.`in`)
    val intNumber:Int = reader.nextInt()
    for (i in 1..intNumber)
    {
        if(i%3==0||i%5==0)
        {
            if (i%3==0 && i%5!=0)
        {
            println("Fizz")
        }
        else if (i%5==0 && i%3==0)
        {
            println("FizzBuzz")
        }
        else if(i%5==0 )
        {
            println("Buzz")
        }
        }
        else{
            println(i)
        }
    }
}
fun main()
{
    fizzBuzz()
}
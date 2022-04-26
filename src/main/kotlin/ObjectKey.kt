data class ObjectKey(var name:String,var price :Int)
object BookShl
{
    var books = arrayListOf<ObjectKey>()
    fun show()
    {
        for (i in books)
        {
            println(i)
        }
    }
}
fun main()
{
    BookShl.books.add(ObjectKey("Java",200))
    BookShl.books.add(ObjectKey("SQL",300))
    BookShl.show()
}
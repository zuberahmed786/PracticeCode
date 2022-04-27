class RemoveVowel {
}

fun remove(st:String) {
    val sb = StringBuilder()

    for (ch in st.toCharArray())
    {
        if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&&ch!='u')
        {
           sb.append(ch)
        }
    }
    return println(sb.toString())
}
fun main()
{
    remove("zuben")
}
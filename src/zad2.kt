fun main()
{
    print("Введите число: ")
    val convert: String? = readLine()
    var number: Int = convert!!.toInt()

    when (number)
    {
        0 -> println("Ноль")
        1 -> println("Один")
        2 -> println("Два")
        3 -> println("Три")
        4 -> println("Четыре")
        5 -> println("Пять")
        6 -> println("Шесть")
        7 -> println("Семь")
        8 -> println("Восемь")
        9 -> println("Девять")
        else -> ("Не найдено")
    }
}
fun main()
{
    print("Введите свой возраст: ")
    val convert: String? = readLine()
    var number: Int = convert!!.toInt()

    when (number)
    {
        in 0..1 -> println("младенец")
        in 2..10 -> println("ребенок")
        in 11..18 -> println("подросток")
        in 19..30 -> println("молодой")
        in 31..65 -> println("взрослый")
        in 65..100 -> println("пенсионер")
        else -> ("Не введен возраст")
    }
}
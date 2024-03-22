import java.lang.Exception

open class Traffic_light {
    fun Povt():Int{
        try {
     println("Сколько повторений вы хотите выполнить?")
     var n=readLine()!!.toInt();
     if (n>0)
         return n
        else
            println("Количество повторений не может быть меньше или равно нулю. Автоматически выставлено значение = 1")
        return 1
        }catch (e:Exception){
            println("Автоматически выставлено значение = 1")
            return 1}
    }

    fun Light()
    {
        try {

            var color1:Int
            println("Введите количество машин у первого светофора")
            var car1 = readLine()!!.toInt()
            println("Введите количество машин у второго светофора")
            var car2 = readLine()!!.toInt()
            do {
                println("Какой цвет у первого светофора?\n1-Красный\n2-Зелёный")
                color1 = readLine()!!.toInt()
                if (color1 != 1 && color1 != 2)
                    println("Неверный ввод, выполняется повтор действия.")
            }while(color1!=1 && color1!=2)
            if (color1 == 1) {
                println("Цвет второго светофора - Зелёный\n")
            } else {
                println("Цвет второго светофора - Красный\n")
            }
            when (color1) {
                1->println("У первого светофора стоят $car1 машин.\n От второго светофора отъезжает $car2 машин\n")
                2->println("От первого светофора отъезжает $car1 машин.\n У второго светофора стоит $car2 машин\n")
            }
        }catch (e:Exception){
            println("Ошибка")}


    }

}
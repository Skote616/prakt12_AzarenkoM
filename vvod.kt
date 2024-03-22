import Git

import kotlinx.coroutines.*

fun main()= runBlocking{

    var reg= ArrayList<String>()
    var akk= mutableListOf<Git>()

        try{
            var pass=""
            var kol=0
            var ot=0
            var op=true
            var check=true
        while (true) {
            check=true
             println("Введите логин (exit для выхода из регистрации участников)")
            val log = readln()
            if (log == "exit") {break}
            else
                if (reg.contains(log)) {
                    println("Данный логин уже существует")
                    check=false
                }
                if (check==true){
                    reg.add(log)
                    println("Введите пароль")
                    pass= readln()
                    if(pass.length<8)
                    {while (pass.length<8)
            {
                println("Пароль слишком короткий, попробуйте ещё раз")
                println("Введите пароль")
                pass= readln()
            }
                    }
            println("Введите количество репозиториев")
            kol=readLine()!!.toInt()
            if (kol<=0) {
                println("Недопустимая величина. Выставлено значение 1")
                kol=1
            }
            println("Они открытые?\n1-Yes\n2-No")
            ot= readln()!!.toInt()
            when (ot)
            {
                1->{op=true}
                2->{op=false}
                else->{println("Неверный ввод, выставлено значение true")
                op=true}
            }
                    val rep=Git(log, pass, kol,op)
                    akk.add(rep)
        }
        }

        }catch (e:Exception){println("Ошибка ввода")}
        println("Подождите минутку...")
    delay(5000L)
    val st=akk.first().sort(akk)
    st.forEach {
        println(it.info())
    }
}





import kotlinx.coroutines.delay
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString

class Git(var login:String, var password:String, var repos:Int, var isOpen:Boolean) {
    suspend fun sort(rep:List<Git>):List<Git>{
        delay(2000L)
        return rep.filter {it.isOpen}.sortedWith(compareBy{it.repos})
    }

    suspend fun info():String
    {
        delay(1000L)
        return "ЛОГИН:$login ПАРОЛЬ:$password КОЛИЧЕСТВО РЕПОЗИТОРИЕВ:$repos"
    }

}
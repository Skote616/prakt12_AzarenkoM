import kotlinx.coroutines.*
suspend fun main(){
    var trafficLight:Traffic_light=Traffic_light()
    var p=trafficLight.Povt()
    GlobalScope.launch {
        for(i in 1..p){
            println("$i повтор")
            trafficLight.Light()
        }
    }
    runBlocking { delay(10000L) }
}
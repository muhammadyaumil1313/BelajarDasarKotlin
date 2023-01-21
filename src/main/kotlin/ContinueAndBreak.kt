fun main() {
    var i = 0
    while (true){
        println("Berhenti mas : $i")
        i++;
        if(i == 10){
            println("Continue")
            continue
        }
        if(i > 1000){
            println("Ciiiiiit")
            break
        }
    }
}
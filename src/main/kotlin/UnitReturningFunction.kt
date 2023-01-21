fun main() {
//    printHello(age=-1, name="Udin")
    val choosen : String = readln()
    val number1 : Int = readln().toInt()
    val number2 : Int = readln().toInt()
    calculate(choosen = choosen, number2 = number2, number1 =  number1)
}
fun printHello(name: String?, age: Int?){
    if(name == null){
        println("Hello Bro")
    }
    if (age != null) {
        if (age <= 0){
            println("Mati Bro ? umur lu kok $age")
            return
        }
        println("Umur anda $age")
    }
    else println("$name")
}
fun calculate(choosen : String, number1 : Int, number2: Int) {
    when{
        choosen == "+" -> {
            println("Plus Result: : ${number1 + number2}")
        }
        choosen == "-" -> {
            println("Minus Result : ${number1 - number2}")
        }
        choosen == "%" -> {
            println("Module Result : ${number1 % number2}")
        }
        choosen == "*" -> {
            println("Multiple Result : ${number1 * number2}")
        }
        else -> println("Wrong Answer")
    }
}
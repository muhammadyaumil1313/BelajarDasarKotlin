fun main() {
    println(factorialTail(10))
}
tailrec fun factorialTail(value: Int, total : Int = 1) : Int{
    return when(value){
        1 -> total
        else -> factorialTail(value - 1, value * total)
    }
}
tailrec fun display(value: Int){
    println("recursive : $value")
    if(value > 0){
        display(value - 1)
    }
}
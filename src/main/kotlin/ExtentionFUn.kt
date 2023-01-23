fun String.hello() : String{
    return "hello $this"
}
fun Int.calculate() : Int{
    return 5 * this
}
fun Int.paramCalc(number: Int) : Int{
    return number * this
}
fun main() {
    val name : String = "Yaumil"
    val hello : String = name.hello()
    val number : Int = 50.calculate()
    val paramCalc : Int = 100.paramCalc(50)
    println(number)
    println(paramCalc)
    println("hello :  $hello")
}
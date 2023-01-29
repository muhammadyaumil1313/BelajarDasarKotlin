import java.util.*

fun toUpper(value : String) : String = value.uppercase(Locale.getDefault())

fun main() {
    println(greetings("Muhammad", "Yaumil"))
    println(calculate("Udin"))
    println(toUpperCase("friska andalusia"))
}

val greetings : (String, String) -> String = {firstName: String, lastName:String ->
    val result = "Hello $firstName $lastName"
    result
}
val toUpperCase : (String) -> String = ::toUpper

val calculate : (String) -> String = {
    "Hello $it"
}
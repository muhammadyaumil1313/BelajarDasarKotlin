import java.util.*

fun main() {
    fun hello(name : String, transform: (String)->String) : String{
        val nameTrans = transform(name)
        return "hello $nameTrans"
    }

    val lambdaUpper = {value : String -> value.uppercase(Locale.getDefault()) }
    println(hello("Friska",lambdaUpper))
    println(hello("ANDALUSIA") { valueString: String -> valueString.lowercase(Locale.getDefault()) })

    val greetings = hello("Ulurilir") {value : String ->
        value.uppercase(Locale.getDefault())
    }
}
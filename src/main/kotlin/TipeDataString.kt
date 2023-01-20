fun main() {
    var firstName = "Friska"
    var lastName = "Andalusia"

    var fullname = """
        >Friska Andalusia, 
    >aku mencintai mu
    """.trimMargin(">")

    println("$firstName, $lastName")
    println(fullname)
}
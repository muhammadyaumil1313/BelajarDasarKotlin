fun main() {
    val members : Array<String> = arrayOf("Eko","Patriot","john")
    val values : Array<Byte> = arrayOf(100,90,5)
    val balances : Array<Int> = arrayOf(100_000,20_000,30_000)
    val carts : Array<String?> = arrayOfNulls(2)

    members.set(0,"yaumil")
    members.get(2)
    carts[0] = "baju"

    members.forEach { element-> println(element) }
    carts.forEach { element2-> println(element2) }

}
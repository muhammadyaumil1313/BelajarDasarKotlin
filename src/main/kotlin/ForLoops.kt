fun main() {
    val names = arrayOf("EKo","Kurniawan","Friska","Audy","Bunga")
    var total = 0
    for (name in names){
        println(name)
        total++
    }
    println("Total Perulangan $total")

    for(i in 0..100 step 2){
        println(i)
    }

    for (j in 100 downTo 0 step 2){
        println(j)
    }

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray){
        println("index $i array : ${names.get(i)}")
    }

    
}
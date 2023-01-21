fun main() {
    val nilai = 'A'
    when(nilai){
        'A' -> println("Amazing")
        'B'-> println("Good")
        'C'-> println("not bad")
        'D'-> println("bad")
        'E'-> println("Jelek banget")
        'F'-> println("Mending balik ke TK")

    }
    when(nilai){
        'A','B','C'-> println("pass")
        else ->{
            println("Maaf anda tidak lulus")
        }
    }
//    val passValue : Array<String> = arrayOf("A","B","C")
//    when(nilai){
//        in passValue -> println("Selamat Anda Lulus")
//        !in passValue -> println("Maaf Tidak Lulus")
//    }

    val name = "yaumil"
    when(name){
        is String -> println("String data")
        !is String -> println("Not String data")
    }

    val examValue = 2
    when{
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try Again Next Year")
    }
}
fun sayHello(name: String) : String{
    return if(name == ""){
        "yaumil"
    }else{
        "Hello $name"
    }



}
fun main() {
    println(sayHello(""))
}
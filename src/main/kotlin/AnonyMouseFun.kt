fun main() {
    fun carName(name: String, fixCar : (String)->String) : String{
        val carFixedOrNot  = fixCar(name)
        return "Car : $carFixedOrNot"
    }
    val fixCar = fun(value: String): String{
        return if(value.isBlank()){
            "Car is Broken cannot be fixed!\n"
        }else{
            "Car fixed! car name is : $value\n"
        }
    }
    println(carName("Honda",fixCar))
    println(carName(" ",fixCar))
}
fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 50

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 65

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen
    println(apakahLulus)
}
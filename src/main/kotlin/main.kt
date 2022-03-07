fun main() {
    val likes = 611
    val man = "человеку"
    val people = "людям"
    val determineFunction = likes % 10
    val determineFunction11 = likes % 100
    println(if (determineFunction !== 1 || determineFunction11 == 11) "Понравлось $likes $people" else "Понравлось $likes $man")
}
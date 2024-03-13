fun main() {
    val userA = User()
    val userB = User()

    userA.name = "Thulio"
    userB.name = "Nayara"

    userA.printUppercase()
    println(userB.name)
    println(userA.name)
}

class User {
    var name: String = "" // propriedade

    fun printUppercase() {
        println(name.uppercase())
    }
}
fun main() {
    val userA = User()
    val userB = User()

    userA.name = "Thulio"
    userB.name = "Nayara"

    userA.printUppercase()
    println(userB.name)
    println(userA.name)

    userA.upadateName("Tulio")
    println(userA.name)

    println(userA.getNameLength())
}

class User {
    var name: String = "" // propriedade

    companion object{ // faz com que todos os objetos criados compartilhem essa propriedade
        var count = 0
    }

    init { //faz iniciar esse trecho antes de tudo
        count++
        println(count)
    }

    fun printUppercase() {
        println(name.uppercase())
    }

    fun upadateName(newName: String) {
        name = newName
    }

    fun getNameLength() : Int {
        return name.length
    }
}
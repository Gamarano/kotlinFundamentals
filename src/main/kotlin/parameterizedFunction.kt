fun main() {
    ageVerification(31)
    checkUser(age = 3, name = "Giovana")
    checkUser(age = 24, name = "Nayara")
    checkUser(34, "Thulio", true)
}

fun ageVerification(age: Int) {
    if (age > 18) {
        println("Voce pode dirigir")
    } else {
        println("Voce não pode dirigir")
    }
}

fun checkUser(age: Int, name: String, isAdmin: Boolean = false){
    if (isAdmin){
        println("Olá $name, sua idade é $age e você é admin")
    } else {
        println("Olá $name, sua idade é $age e você não admin")
    }
}
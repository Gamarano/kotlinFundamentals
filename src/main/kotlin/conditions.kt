fun main() {
    // logical conditions
    // ( < , > , <= , >= , == , !=)
    val age = 30

    if (age > 60) {
        println("voce é idoso")
    } else if (age >= 18){
        println("você é maior de idade")
    } else {
        println("você é menor de idade")
    }

    // composite conditions
    // you use && ( and ) or || ( or )

    val price = 50
    val product = "Mouse"

    if (price > 50 && product=="Mouse"){
        println("verdadeiro")
    } else {
        println("falso")
    }

}
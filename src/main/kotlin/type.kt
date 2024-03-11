fun main() {
    /* When you don't declare a type it is considered an inferred type */

    val price: Double = 31.90 //Kotlin already implies the type but if you want to declare the type, just put ':' after the variable and put the type
    val product = "iMac"
    val age = 34

    println(price::class) //Inside println if you put ::class the type of this variable will be printed (int, double, string, bool, ...)
}
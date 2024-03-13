fun main() {
    //For your variable to accept a null value you need to put a dot ? after her
    var product: String? = "iMac" // this way String starts accepting null value, that is, it becomes nullable
    println(product)
    product = "iPhone"
    println(product)
    product = null

    println(product)

    // The Elvis operator (?:) is used to provide a default value when the value on the left is null

    val result: String? = null
    val size = result?.length?: -1

    println(size) // Output: -1
}
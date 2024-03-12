fun main() {
    val price = 31
    println(price)
    println(price::class)

    val newPrice = price.toDouble()
    println(newPrice)
    println(newPrice::class)

    val newPrice2 = price.toByte()
    println(newPrice2)
    println(newPrice2::class)
}
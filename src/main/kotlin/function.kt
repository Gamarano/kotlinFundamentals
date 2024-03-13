fun main() {
    val response = add()
    subtract()

    println(response)
}


fun add(): Int{ // If you don't declare the return type it will be a Unit function (without return)
    return 2+3
}

fun subtract() {
    val response = 3-1

    println(response)
}
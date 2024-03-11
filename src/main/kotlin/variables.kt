fun main() {
    var product = "iMac" //variable that is stored as a string
    println(product) //will print iMac

    product = "iPhone" //var: is a mutable variable, meaning it can change its state
    println(product) //will print iPhone

    val iphone = "iPhone Val" //val: if I want my variable to be immutable I must use the reserved word val
    /*iphone = "iMac" //This will generate an error during compilation*/
    println(iphone)
}

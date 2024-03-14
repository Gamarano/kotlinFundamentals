class Calculator (var num1 :Double, var num2 :Double ) {

    fun addition() :Double{
        return num1 + num2
    }

    fun subtraction() :Double{
        return num1 - num2
    }

    fun multiplication() :Double{
        return num1 * num2
    }

    fun division() : Double? {
        if ( num2 != 0.0){
            return num1 / num2
        } else {
            println("No number can be divided by zero")
        }
        return null
    }
}
//class UserConstructor constructor( var name: String = "")


class UserConstructor ( var name: String = "") {

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
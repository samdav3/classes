class Person constructor(firstName: String,
                         lastName: String,
                         middleInitial: String,
                         age: Int){
    var fullName: String = ""
    var firstName: String = firstName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }
    var lastName: String = lastName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }
    var middleInitial: String = middleInitial
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }

    var age: Int = age
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }
    init {
        fullName = "$firstName $middleInitial $lastName"
    }
    fun printAll(){
        println("$fullName is $age")
    }
}
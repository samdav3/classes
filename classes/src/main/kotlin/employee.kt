class employee constructor( firstName:String,
                           lastName:String,
                           var position:String,
                           var salary:Boolean,
                           var hourly:Double,
                           var shift: Int,
                           var hours:Int) {
    var fullName:String = ""
    var firstName: String = firstName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $lastName"
        }
    var lastName: String = lastName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $lastName"
        }
    init {
        fullName = "$firstName $lastName"
    }

    fun display(){
        println("$fullName"  + "\n" + "$position is salary: $salary" + "\n" + "Shift: $shift")
    }

    fun calculation(){
        var totalEarned = hourly * hours
        println("Rate of pay is: $hourly per hour")
        println("$fullName earned $totalEarned this week")
    }
}
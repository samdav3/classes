fun main() {
    var emp1 = employee("Sam",
                        "Davenport",
                        "Administration",
                        true,
                        30.0,
                        1,
                        45)
    var emp2 = employee("Katie",
                        "Callahan",
                        "Retail/Sales",
                        false,
                        33.50,
                        2,
                        50)
    var emp3 = employee("Kelsey",
                        "Stealy",
                        "Maintenance",
                        false,
                        35.75,
                        3,
                        35)

    emp1.display()
    emp1.calculation()
    emp2.display()
    emp2.calculation()
    emp3.display()
    emp3.calculation()

}
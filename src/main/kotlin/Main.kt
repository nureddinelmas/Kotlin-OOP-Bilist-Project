fun main(args: Array<String>) {
    val d1 =  Driver("Emilia",17)
    val d2 =  Driver("Niklas", 21)

    val v1 : Vehicle =  Car(100.0,Driver())
    val v2 : Vehicle  = MilitaryTank(2000.0,Driver())

    v1.drive()
    v2.drive()

    v1.driver= d1
    v1.drive()

    v1.driver = d2
    v2.driver = d2
    v2.drive()

    v2.driver = Driver("TankMan", 300)

    v1.drive()
    v2.drive()
    v1.drive()
    v2.drive()


}

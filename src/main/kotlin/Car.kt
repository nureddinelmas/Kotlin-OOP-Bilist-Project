class Car (miles :Double, driver: Driver) : Vehicle(miles, driver) {
    override fun drive(){
        var useMiles = 0.0
        if (driver.name == ""){
            println("Car didn't drive!-- there is no driver! ")
        }
        else if (driver.age!! < 18){
            println("Car didnt drive!-- " +
                    "${driver.name} is ${driver.age}, but must be 18 or older to drive")
        }
        else{
            // om man vill får man ett värde av använderen
            // println("hur många miles åkte du?")
            // useMiles = readLine()!!.toDouble()

            // eller vi anger miles på egen hand
            useMiles = 10.0
            miles = miles?.minus(useMiles)
            println("Car drove $useMiles miles och $miles miles to go")
        }
    }
}
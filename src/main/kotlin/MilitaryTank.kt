class MilitaryTank (miles : Double, driver : Driver) : Vehicle(miles,driver) {
    override fun drive(){
        var useMiles = 0.0
        if (driver.name == ""){
            println("MilitaryTank didn't drive!-- there is no driver! ")
        }
        else if (driver.age!! < 25){
            println("MilitaryTank didnt drive!-- " +
                    "${driver.name} is ${driver.age}, but must be 25 or older to drive")
        }
        else{
            // om man vill får man ett värde av använderen
            // println("hur många miles åkte du?")
            // useMiles = readLine()!!.toDouble()

            // eller vi anger miles på egen hand
            useMiles = 5.0
            miles = miles?.minus(useMiles)
            println("MilitaryTank drove $useMiles miles och $miles miles to go")
        }
    }
}
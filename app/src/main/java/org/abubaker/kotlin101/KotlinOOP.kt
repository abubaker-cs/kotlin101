package org.abubaker.kotlin101

var b = 3
fun main() {

    var b = 10
    var denis: Person = Person("Denis", "Panjuta", 31)
    denis.hobby = "to skateboard"
    denis.age = 35
    println("${denis.fname} is ${denis.age} years old")
    denis.stateHobby()

    var john = Person()
    john.hobby = "to play video games"
    john.stateHobby()
    /// var johnPeterson = Person(lastName = "Peterson")

    // var sample = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    // val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    // val galaxyS20 = MobilePhone("Android", "Samsung", "Galaxy S20")
    // val mateXS = MobilePhone("Android", "Huawei", "Mate X S")

    // this a is an argument
    // myFunction(5)


}


class Person constructor(firstName: String = "John", lastName: String = "Doe") {

    // Member Variables | Properties
    var age: Int? = null

    var fname: String? = null
    var lname: String? = null

    var hobby: String = "watch Netflix"


    // It will be initialized whenever the Person will be created
    init {
        this.fname = firstName
        this.lname = lastName
        // println("Initialized a new Person Object with:" + "\nFirst Name = $firstName \nLast Name = $lastName \n")
    }

    // Member Secondary Constructor
    constructor(
        firstName: String,
        lastName: String,
        age: Int
    ) : this(firstName, lastName) {
        this.age = age
        println("Initalized $firstName $lastName who is $age years old")
    }

    // Member Functions | Methods
    fun stateHobby() {
        println("$fname $lname's hobby is $hobby")
    }

}

class MobilePhone constructor(osName: String, brand: String, model: String) {

    private var battery = 30

    init {
        println(
            "$brand $model. \n" +
                    "Here the osName is $osName, " +
                    "brand is $brand " +
                    "model is $model \n"
        )
    }

    fun chargeBattery(chargedBy: Int) {
        println("Battery was at $battery and is at ${battery + chargedBy} now")
        battery += chargedBy
    }

}

/**
 * Scope
 */

// this a : Int is a parameter
fun myFunction(a: Int) {

    // a is a local variable which will store the info of the recieved arugment through parameter
    var b = a
    println("b is $b")
}



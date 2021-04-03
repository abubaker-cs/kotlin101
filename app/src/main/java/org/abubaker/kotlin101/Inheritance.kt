package org.abubaker.kotlin101

/**
 * The class that inherits the features of another class is called the:
 * 1. Sub Class
 * 2. Child Class
 * 3. Derived Class
 *
 * And the class whose features are inherited is called the:
 * 1. Super Class
 * 2. Parent Class
 * 3. Base Class
 */

// Since all classes in Kotlin are by default "final", means they can not be inherited by other classes
// So, we need to use "open" to let it be used as a parent class

// A feature which allow us to extend the functionality of classes
interface Drivable {

    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }


}

// It is a Parent class
// open class Vehicle {
// }

// Sealed: It cannot be inherited
// Open; It can be inherited
// It is the Child class of the Vehicle() by also the Parent class of ElectricClass()
open class car(override val maxSpeed: Double, val name: String, val brand: String) : Drivable {

    // open is required to override range property by child
    open var range: Double = 0.0

    // Methods
    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double) {
        println("Drove for $distance km")
    }

}

class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) :
    car(maxSpeed, name, brand) {

    var chargerType = "Type1"

    override var range = batteryLife * 5

    override fun drive(distance: Double) {
        println("Drove for $distance km on Electricity")
    }

    override fun drive(): String {
        return "Drove for $range km on Electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }

}

fun main() {
    var audiA3 = car(200.0, "A3", "Audi")
    var teslaS = ElectricCar(240.0, "S-Model", "Tesla", 85.0)

    teslaS.chargerType = "Type2"
    // teslaS.extendRange(150.0)

    teslaS.drive()

    teslaS.brake()
    audiA3.brake()


    // Polymorphism: Ability to treat objects with traits in a common way
    // Tesla has similar traits as it is inheriting from Car() and ElectricCar()
    // audiA3.drive(200.0)
    // teslaS.drive(220.0)

}

/**
 * Interface:
 * It is essentially a contract that a class may choose to sign.
 * If it does, the class is "obliged" to provide "implementations" of the properties and functions of the interface.
 *
 */




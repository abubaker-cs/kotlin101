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

// It is a Parent class
// open class Vehicle {
// }

// Sealed: It cannot be inherited
// Open; It can be inherited
// It is the Child class of the Vehicle() by also the Parent class of ElectricClass()
open class car(val name: String, val brand: String) {
    // Properties
    var range: Double = 0.0

    // Methods
    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    fun drive(distance: Double) {
        println("Drove for $distance km")
    }

}

class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(name, brand) {

}

fun main() {
    var myCar = car("A3", "Audi")
    var myECar = ElectricCar("S-Model", "Tesla", 85.0)



}


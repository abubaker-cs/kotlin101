package org.abubaker.kotlin101

import java.lang.IllegalArgumentException

fun main() {

    var myCar = Car()
    println("Brand is: ${myCar.myBrand}")

    myCar.maxSpeed = 120
    println("MaxSpeed is: ${myCar.maxSpeed}")

    println("Model is ${myCar.myModel}")
    // myCar.myModel = "M3"

}

class Car() {

    // An initialized Variable
    var Jeep: String = ""

    // We will initialize it later
    lateinit var owner: String

    val myBrand: String = "BMW"
        // This is a custom GETTER
        get() {
            return field.toLowerCase()
        }

    // Kotlin auto-generates getter/setter values in the background. No need to manually create them.
    var maxSpeed: Int = 250
        // get() = field
        set(value) {
            field =
                if (value > 0) value else throw IllegalArgumentException("MaxSpeed cannot be less than 0")
        }

    var myModel: String = "M5"
        private set

    init {
        this.myModel = "M9"
        this.owner = "Frank"
    }

    /**
     * Notes
     * =====
     *
     * Field:
     * It is a "backing field" which helps you to refer to properties inside the getter/setter methods.
     *
     * Value:
     * Value that you have given to a variable when you set it.
     */


}
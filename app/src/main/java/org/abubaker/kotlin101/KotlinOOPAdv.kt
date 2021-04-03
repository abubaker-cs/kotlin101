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

open class Car() {

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
     * 1. Value:
     * Value that you have given to a variable when you set it.
     * We use value as the name of the setter parameter. This is the default convention in Kotlin
     * but you’re free to use any other name if you want. The value parameter contains the value
     * that a property is assigned to. For example, when you write user.name = "Elon Musk",
     * the value parameter contains the assigned value "Elon Musk".
     *
     * 2. Backing Field (field)
     * Backing field helps you refer to the property inside the getter and setter methods.
     * This is required because if you use the property directly inside the getter or setter then you’ll
     * run into a recursive call which will generate a StackOverflowError.
     *
     * It is a "backing field" which helps you to refer to properties inside the getter/setter methods.
     * It is helpful inside getter/setter, because if we will use the property directly
     * then you will run into a "recursive call" which will generate a "stack overflow" error.
     *
     */

// value


}
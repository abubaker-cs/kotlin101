package org.abubaker.kotlin101

/**
 * Understanding Functions in Kotlin
 *
 * Method vs Function
 * Method - it is a function within a Class, i.e: onCreate()
 * Function - it is placed OUTSIDE the class
 */
fun main() {

    // Argument (what we are sending): (5, 3)
    // var result = addUp(5, 3)
    var avg = avg(5.20, 13.37)
    println("Results is $avg")

    var sum = addUp(5, 3)
    println("Sum: $sum")

}

// Parameter (what will be recieved) (input)
fun addUp(a: Int, b: Int): Int {

    // Output
    return a + b

}

fun myFunction() {
    println("Called from myFunction")
}

fun avg(a: Double, b: Double): Double {
    return (a + b) / 2
}
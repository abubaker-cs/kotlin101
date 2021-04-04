package org.abubaker.kotlin101

fun main() {
    // Standard Call
    // addNumber(5,10)

    // Call for Lambda Expression
    println(sum(5, 15))
}


// Standard Function
fun addNumber(a: Int, b: Int) {
    val add = a + b
    println(add)
}

// Same example in Lambda Expression
val sum: (Int, Int) -> Int = { a: Int, b: Int ->
    a + b
}
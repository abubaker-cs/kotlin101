package org.abubaker.kotlin101

fun main() {

    // sayHello("Abubaker", 36)
    // var moduloVar = moduloFun(5,3)

    var isConnected = connect(5)
    print(isConnected)

    // val name: String = null

}

// Q1
fun sayHello(name: String, age: Int){
    println("Hi $name, I heard you are $age years old, is that right?")
}

// Q2
fun moduloFun(num1: Int, num2: Int): Int{
    return num1%num2
}

//
fun connect(num1: Int): Boolean{
    var result = false
    if(num1 > 0){
        result = true
    }
    return result
}
package org.abubaker.kotlin101

fun main() {

    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changable)

    // val myName = "Denis"
    // myName = "Michael" // ERROR: Val cannot be reassigned

    // Var = Variable | Val = Constant
    var myName = "Abubaker Farooq"

    // TODO: Add new functionality
    // println("Hello $myName")

    /* This is a multi line comment starts with /* and ends with *'/ without the '
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference.
     The compiler will directly assume the size and type to a variable by that.
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int
    */ */
    var myAge = 31

    /**
     * Types for Numbers:
     *    1. Byte (8 bit)
     *    2. Short (16 bit)
     *    3. Int (32 bit)
     *    4. Long (64 bit)
     */
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_921_123_121_323_45

    /**
     * Types for Float Numbers:
     *    1. Float (32 bit)
     *    2. Double (64 bit)
     */
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14564564654853

    /**
     * Booleans is used to represent logical values.
     * It can have two possible values true and false.
     */
    var isSunny: Boolean = true
    isSunny = false


    /**
     * Characters
     */
    val letterChar = 'A'
    val digitChar = '1'

    /**
     * Strings
     */
    val myStr = "Hello World"
    val firstCharInStr = myStr[0] // ='H'
    val lastCharInStr = myStr[myStr.length - 1] // = 'd'

    // println("First Character: $firstCharInStr")
    // println("Last Character: $lastCharInStr")

    /**
     * Challenge Exercise
     * URL: https://www.udemy.com/course/android-kotlin-developer/learn/lecture/16824434#notes
     *
     * Assign appropriate DATA Types to the following numbers
     *
     * "Android Masterclass"
     * 13.37F
     * 3.14159265358979
     * 25
     * 2020
     * 18881234567
     * true
     * 'a'
     *
     */


    //
    var qString: String = "Android MasterClass"
    var qFloat: Float = 13.37F

    val qPi: Double = 3.14159265358979

    var qByte: Byte = 25
    var qShort: Short = 2020
    var qLong: Long = 18881234567

    var qBoolean: Boolean = true
    var qChar: Char = 'a'

    /**
     * Arithmetic Operators (+, -, *, /, %)
     */
    var result = 0
    var resultDouble: Double
    val a = 5.0
    val b = 3
    resultDouble = a / b
    println("Result: $resultDouble")


    /**
     * Comparison operators (==, !=, <, >, <=, >=)
     */
    val isEqual = 5 == 3
    println("Is 5 == 3 : $isEqual")

    val isNotEqual = 5 != 5
    println("Isn't 5=5? : $isNotEqual")


    println("is 5 greater than 3 : ${5>3}")

    /**
     * Assignment operators (+=, -=, *=, /=, %=)
     */

    /**
     * Increment & Decrement operators (++, --)
     */

}
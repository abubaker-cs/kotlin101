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
    // println("Result: $resultDouble")


    /**
     * Comparison operators (==, !=, <, >, <=, >=)
     */
    val isEqual = 5 == 3
    // println("Is 5 == 3 : $isEqual")

    val isNotEqual = 5 != 5
    // println("Isn't 5=5? : $isNotEqual")

    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation

    // println("Is -5 < 3 : ${-5 < 3}")
    // println("Is 5 > 3 : ${5 > 3}")
    // println("Is 5 <= 3 : ${5 <= 3}")

    /**
     * Assignment operators (+=, -=, *=, /=, %=)
     */
    var myNum = 5
    myNum += 3
    myNum *= 4
    // println("myNum is $myNum")


    /**
     * Increment & Decrement operators (++, --)
     */
    myNum++
    // println("myNum++ is $myNum")
    // println("{myNum++} is ${myNum++}")
    // println("myNum after ++ is $myNum")
    // println("{++myNum} is ${++myNum}")

    // myNum--
    // println("myNum-- is $myNum")

    /**
     * If Else Statement
     */
    var heightPerson1 = 370
    var heightPerson2 = 570

    if (heightPerson1 > heightPerson2) {
        println("Person 1 > Person 2")
    } else if (heightPerson1 < heightPerson2) {
        println("Person 1 < Person 2")
    } else {
        println("They have equal")
    }

    // Control Flows
    // If Statements
    val age = 33
    if (age >= 21) {
        println("now you may drink in the US")
    }
    // Else If Statement - only executed if the if statement is not true
    else if (age >= 18) {
        println("you may vote now")
    }

    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (age >= 16) {
        println("You may drive now")
    }

    // else is only executed if all of the foregoing statements weren't true
    else {
        print("stay at home, you are too young")
    }

    var yourName = "Denis"
    if (yourName == "Abubaker") {
        println("Welcome home Abubaker")
    } else {
        println("Who are you?")
    }

    val isRainy = true
    if (isRainy)
        println("It's rainy")

    /**
     * When
     */


    // Kotlin???s "when" expression is the replacement of the switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    val season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    val month = 1
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    // Note: Only the first match will be executed. Just like if statement.
    val my_age = 11
    when (my_age) {
        // !in NOT in the range
        !in 0..10 -> println("now you may drink in the US...")
        in 18..20 -> println("you may vote now")
        16, 17 -> println("You may drive now")
        else -> print("stay at home, you are too young")
    }

    // is (keyword)
    var y: Any = 13.37F
    when (y) {
        is Int -> println("$y is an Int")
        !is Double -> println("$y is not a Double")
        is String -> println("$y is a String")
        else -> println("$y is none of the above")
    }


    val value = 1;
    var x = "aah"

    if (value > 5) {
        if (value < 2) {
            x = "oh"
            println("X = $x")
        }
    }

    var aged = 25
    when (aged) {
        in 21..100 -> println("Swiftey")
        in 15..20 -> println("just do it")
    }

    /**
     * While Loop
     */
    var data = 100
    while (data >= 0) {
        println("X: $data")
        data -= 2
    }

    /**
     * Do-While
     * The do-while loop is similar to while loop except that it
     * tests the condition at the end of the loop.
     * This means that it will at least execute the body once
     */
    var beta = 100
    do {
        println("Beta : $beta")
        beta++
    } while (beta <= 10)

    var feltTemp = "cold"
    var roomTemp = 10

    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    /**
     * For Loops
     * A for-loop is used to iterate through ranges, arrays, collections, or anything
     * that provides an iterator (You???ll learn about iterator, arrays, range
     */

    // Last Output: 10
    for (num in 1..10) {
        println("Num: $num")
    }

    // Last Output: 9
    for (i in 1 until 10) {
        println("i: $i")
    }

    // Last Output: 2
    for (j in 10 downTo 1 step 2) {
        println("j: $j")
    }

    // Last Output: 2
    for (k in 10.downTo(1).step(2)) {
        println("k: $k")
    }

    /**
     * Challenges
     */

    // Challenge 1
    for (num in 1..10000) {

        if (num == 9001) {
            println("IT's Over 9000!!!, because the current value of num is $num")
        }

    }

    // Challenge 2


    /**
     * Write a while loop that checks the humidity (not the humidityLevel).
     *
     * The variable humidityLevel starts at 80.
     * The variable humidity is initialized with "humid".
     *
     * If it is "humid" then it should reduce the "humidityLevel" by 5
     * and print "humidity decreased"
     * Once the humidityLevel is below 60 it should print "it's comfy now"
     * and set the humidity to "comfy"
     */

    var humidity = "humid"
    var humidityLevel = 80

    while (humidity == "humid") {

        humidityLevel -= 5
        println("humidity decreased by 5deg, and now it is at $humidityLevel")

        if (humidityLevel < 60) {
            humidity = "comfy"
            println("it's comfy now")
        }
    }

    /**
     * Quiz 3
     */

    // Q1 - 1 3 5 7 9
    for(i in 1 until 10 step 2) {
        print("$i ")
    }

    println("\n=========")

    // Q2 - 1234
    var xy = 1
    while(xy <= 10) {
        print("$xy")
        if (xy == 4){
            xy = 10
        }
        xy++
    }

    println("\n=========")

    // Q3 - 12
    var z = 12
    do {
        print("$z ")
    } while(z <= 10)

    println("\n=========")

    // Q4 - 100 Times
    var counter = 0

    for (x in 0..9) {
        for (y in 0..9) {
            counter++
            println("$counter - Result = ${x * y}")
        }
    }

    println("\n=========")

    // 05
    var Qx = 0
    for (Qy in 0..9) {
        Qx += Qy
    }

    println("x: $Qx")

}
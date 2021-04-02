package org.abubaker.kotlin101

fun main() {
    var denis: Person = Person("Denis", "Panjuta")
    var john = Person()
}

class Person constructor(firstName: String = "John", lastName: String = "Doe") {

    // It will be initialized whenever the Person will be created
    init {
        println(
            "Initalized a new Person Object with:" +
                    "\nFirst Name = $firstName \nLast Name = $lastName \n"
        )
    }

}
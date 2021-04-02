package org.abubaker.kotlin101

fun main() {
    // var denis: Person = Person("Denis", "Panjuta")
    // var john = Person()
    /// var johnPeterson = Person(lastName = "Peterson")

    var sample = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe") {

    // It will be initialized whenever the Person will be created
    init {
        println(
            "Initialized a new Person Object with:" +
                    "\nFirst Name = $firstName \nLast Name = $lastName \n"
        )
    }

}

class MobilePhone constructor(osName: String, brand: String, model: String) {

    init {
        println(
            "$brand $model. \n" +
            "Here the osName is $osName, " +
                    "brand is $brand " +
                    "model is $model \n"
        )
    }

}
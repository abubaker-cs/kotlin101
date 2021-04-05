package org.abubaker.kotlin101

/**
 * Nested Class - Cannot access members of Outer class
 *
 * When a class is created inside another class
 * static (default) - so its members and functions can be accessed without creating on object of the class
 *
 * 1-Way Relationship - Nested classes cannot access the data members of outer class
 *
 */
class OuterClass {

    // outer class code
    private var name: String = "Mr X"

    class NestedClass {

        // nested class code
        var description: String = "Code inside nested class"
        private var id: Int = 101

        fun foo() {
            // cannot access the outer class
            // print("name is ${name}")

            println("Id is $id")
        }

    }
}


/**
 * Inner Class - Can access members of parent class
 *
 * When a class is created inside another class with "inner" keyword
 * Can't be declared inside interfaces or non-inner nested classes
 *
 * Inner Vs Nested:
 * Inner classes are able to access members of its outer class even if it is private
 *
 */
class OuterParentClass {

    private var name: String = "Mr X"

    inner class InnerClass {
        var description: String = "Code inside nested class"
        private var id: Int = 202

        fun foo() {
            print("name is $name")
            println("Id is $id")
        }
    }

}


/**
 *
 */
fun main(args: Array<String>) {
    // object creation
    var obj = OuterClass.NestedClass()

    // nested class must be initialized
    // Accessing Property
    println(obj.description)

    // Access member function
    obj.foo()

    ///////////////////////////////////////

    // var objInner = OuterParentClass.InnerClass()

    // Accessing Property
    // println(OuterParentClass.InnerClass.description)

}
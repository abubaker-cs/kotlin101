package org.abubaker.kotlin101

/**
 * Scoping:
 * =======
 * Classes, Interfaces, Methods and Properties can be RESTRICTED using:
 * 1. Public - (DEFAULT) - Global Access
 * 2. Private - Inside BLOCK
 * 3. Protected -
 * 4. Internal - Inside MODULE
 * 5. Open
 */

/////////////////////////////////// Public
/**
 * 1. Default
 * 2. Global Access
 */
public class exPublic {

}

class Demo {

}

public fun hellp() {}

fun demo() {}

public val x = 5

val y = 10


///////////////////////////////////// Private
/**
 * 1. No access outside the Scope
 * 2. Only accessible inside the specific file
 */

// Access - inside the file
private class exPrivate {

    // Access - inside exPrivate
    private val x = 1

    // Access - inside exPrivate
    // private doSomething() {}

}

///////////////////////////////////// Internal
/**
 * 1. Not available in Java
 * 2. Makes the field visible ONLY inside the Module in which it is implemented
 * */
internal class Example {
    internal val x = 5
    internal val y = 10

    internal fun getValue() {

    }

}

///////////////////////////////////// Protected
/**
 * 1. Allows visibility to a class or its sub-class
 * 2. When overridden in its subclass, is also protected unless it is explicitly changed
 * 3. Protected modifiers CANNOT be declared at top level (for packages)
 */

open class Base {
    protected val i = 0
}

class Derived : Base() {
    fun getValue(): Int {
        return i
    }
}


///////////////////////////////////// Open
/**
 * 1. By default all classes are FINAL
 * 2. They can't be inherited by default
 * 3. To make classes inheritable, we need to mark them as open
 */

open class testing {

}

///////////////////////////////////// Overriding of protected types
open class Speed {
    protected open val i = 5
}

class Another : Speed() {
    fun getValue(): Int {
        return i
    }

    override val i = 10
}


/////////////////////////// Example of Visibility Modifier
open class Jeep() {

    // public (default)
    var a = 1

    // private to Jeep() class
    private var b = 2

    // visible to Jeep() and SUV() classes
    protected open val c = 3
    protected fun e() {}

    // visible inside same MODULE
    internal val d = 4

}

class SUV : Jeep() {

    // a,c,d,e() are visible here
    // b is not visible to Jeep()
    override val c = 9

}

fun main(args: Array<String>) {

    // Visible: jeep.a, jeep.d
    // Invisible: jeep.b, jeep.c and jeep.e()
    val jeep = Jeep()

    // Invisible: suv.c
    val suv = SUV()

}


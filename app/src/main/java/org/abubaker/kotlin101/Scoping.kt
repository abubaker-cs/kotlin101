package org.abubaker.kotlin101

/**
 * Scoping:
 * =======
 * Classes, Interfaces, Methods and Properties can be RESTRICTED using:
 * 1. Public - (DEFAULT) - Global Access
 * 2. Private - Inside BLOCK
 * 3. Protected -
 * 4. Internal - Inside MODULE
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



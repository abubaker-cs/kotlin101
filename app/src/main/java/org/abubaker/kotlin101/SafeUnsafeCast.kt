package org.abubaker.kotlin101

/**
 * Unsafe cast operator: as
 */

// A nullable string (String?) cannot be case to non-nullable string (String), as it will throw an exception error:

fun main(args: Array<String>) {
    // val obj: Any? = null
    // val str: String = obj as String
    // println(str)

    /**
     * Output Error:
     * Exception in thread "main" java.lang.NullPointerException: null cannot be cast to non-null type kotlin.String
     */

    /**
     * #2 - Trying to cast an integer value of the Any type into a String type leads to ClassCastException
     *
     * Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
     */

    // val objs: Any = 123
    // val str: String = objs as String
    // println(str)

    // Nullable for Casting to work:
    val obj: Any? = "String unsafe cast"
    val str: String? = obj as String?
    println(str)

    /**
     * Safe cast operator: as?
     *
     * It provides a safe cast operation to safely cast to a type
     * It returns a null if casting is not possible rather than throwing an ClassCastException exception
     *
     */

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}



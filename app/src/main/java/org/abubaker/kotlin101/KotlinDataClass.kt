package org.abubaker.kotlin101

// Requires at least 1 parameter
// The cannot be:
// 1. Abstract
// 2. Open
// 3. Sealed
// 4. inner classes
data class User(
    val id: Long,
    var name: String
)

fun main() {
    // Object of a Data Class
    val user1 = User(1, "Denis")

    // val name = user1.name
    // println(name)

    user1.name = "Abubaker"

    val user2 = User(1, "Abubaker")

    println(user1 == user2)

    println("User Details: $user1")

    // copy data
    val updatedUser = user1.copy(name = "Denis Panjuta")
    println(user1)
    println(updatedUser)

    // getting components
    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // print Denis Panjuta

    // Deconstruction
    val (id, name) = updatedUser
    println("ID: $id, Name: $name")

    // Above line is equal to:
    // val user_id = updatedUser.id
    // val user_name = updatedUser.name

}
package org.abubaker.kotlin101

fun main() {

    /**
     * Example 01 - Standard Approach
     */
    val arrayListEx1 = ArrayList<String>()

    arrayListEx1.add("One")
    arrayListEx1.add("Two")
    arrayListEx1.add("Three")
    arrayListEx1.add("Four")
    arrayListEx1.add("Five")
    arrayListEx1.add("Six")
    arrayListEx1.add("Seven")
    arrayListEx1.add("Eight")
    arrayListEx1.add("Nine")
    arrayListEx1.add("Ten")

    println("... printing ArrayList Ex01 ...")

    for (i in arrayListEx1) {
        println(i)
    }

    /**
     * Example 02 - Using Collection
     */
    val arrayListEx2: ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("One 1")
    list.add("Two 2")

    arrayListEx2.addAll(list)

    println("... printing ArrayList Ex02.. ")

    val itr = arrayListEx2.iterator()

    while (itr.hasNext()) {
        println(itr.next())
    }

    println("Size of arrayList Ex02 = " + arrayListEx2.size)

    /**
     * Example 03 - get()
     */
    val arrayListEx3: ArrayList<String> = ArrayList<String>()
    arrayListEx3.add("1 One")
    arrayListEx3.add("2 Two")
    arrayListEx3.add("3 Three")

    for (i in arrayListEx3) {
        println(i)
    }

    println("\n... printing ArrayList Ex03 .. ")
    println(arrayListEx3.get(2))
    // Indexing Operator:
    // println(arrayListEx3[2])


    /**
     * Example 04 -  Average
     */

    val findAverage: ArrayList<Double> = ArrayList()
    findAverage.add(13.212312)
    findAverage.add(23.151232)
    findAverage.add(32.651553)
    findAverage.add(16.223817)
    findAverage.add(18.523999)
    var total = 0.0
    for (i in findAverage) {
        total += i
    }
    var average = total / findAverage.size
    println("\nAverage is $average")

}
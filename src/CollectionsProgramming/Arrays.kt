package CollectionsProgramming


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 17.04.2019 - 11:27          │
└─────────────────────────────┘
 */

fun main() {

    // Example 1

    // Numbers :   10  30  50  40  90
    // Index    :   0   1   2   3   4

    var myArray = Array<Int>(5) { 0 }   // Mutable. Fixed Size.
    myArray[0] = 10
    myArray[3] = 40
    myArray[1] = 30
    myArray[4] = 90
    myArray[2] = 50

    for (index in 0 until myArray.size) {
        println(myArray[index])
    }


    // Example 2

    // String :  Okan  Ahmet   Fatma    Ayse
    // Index  :   0      1       2        3

    val myStringArray = ArrayList<String>().apply {

        add("Okan")
        add("Ahmet")
        add("Fatma")
        add("Ayse")
    }

    println(myStringArray)


}

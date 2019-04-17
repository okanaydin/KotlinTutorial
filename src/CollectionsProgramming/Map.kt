package CollectionsProgramming


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 17.04.2019 - 11:52          │
└─────────────────────────────┘
 */

fun main() {

    var myMap = hashMapOf<Int, String>()

    myMap.put(1001, "Okan")
    myMap.put(1002, "Aydin")
    myMap.put(1003, "Ayse")
    myMap.put(1004, "Fatma")
    myMap.put(1005, "Ahmet")

    println("myMap Size: " + myMap.size)
    println("myMap Values: " + myMap.values)
    println("myMap Keys: " + myMap.keys)
    println("Element at 1003: " + myMap.get(1003))

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}")
    }


}

package OOP


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 24.02.2019 - 21:47          │
└─────────────────────────────┘
 */

fun main() {

    var cat = MyCat()

    println(cat.color)

    cat.talk()

}

open class Animal {                       // Base class / Super class /  Parent class

    open var color: String = "brown"

    open fun talk() {
        println("animal is talking")
    }
}


class MyCat : Animal() {                  // Derived class / Sub class / Child class

    var age: Int = 3

    override var color: String = "black"  // Property Overriding

    override fun talk() {                 // Method Overriding
        super.talk()
        println("cat is talking")
    }
}
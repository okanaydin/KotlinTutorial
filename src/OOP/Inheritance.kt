package OOP


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 24.02.2019 - 20:54          │
└─────────────────────────────┘
 */
fun main() {

    var newAnimal = AnimalBase()
    newAnimal.color = "brown"
    newAnimal.eat()

    println("color of new animal is : ${newAnimal.color}")

    var dog = Dog()
    dog.bread = "golden"
    dog.color = "white"
    dog.walk()
    dog.eat()

    println("color of dog is : ${dog.color} and its bread: ${dog.bread}")

    var cat = Cat()
    cat.age = 4
    cat.color = "black"
    cat.talk()
    cat.eat()

    println("color of cat is : ${cat.color} and its age: ${cat.age}")

}

open class AnimalBase {         // Base class / Super class /  Parent class

    var color: String = ""

    fun eat() {
        println("animal is eating")
    }
}

class Dog : AnimalBase() {      // Derived class / Sub class / Child class

    var bread: String = ""

    fun walk() {
        println("dog is walking")
    }
}

class Cat : AnimalBase() {      // Derived class / Sub class / Child class

    var age: Int = 3

    fun talk() {
        println("cat is talking")
    }
}
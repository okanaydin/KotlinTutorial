package OOP

/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 25.02.2019 - 15:30          │
└─────────────────────────────┘
 */


fun main() {

    var myAnimal = InterfaceImp()
    myAnimal.eat()
    myAnimal.walk()
}


interface MyInterfaceA {           // You cannot create the instance of interface

    fun eat()                       // abstract method

    fun walk() {
        println("My Interface A: walk")
    }
}

interface MyInterfaceB {              // You cannot create the instance of interface

    fun eat() {
        println("My Interface B: eat")
    }

    fun walk() {
        println("My Interface B: walk")
    }

}

class InterfaceImp : MyInterfaceA, MyInterfaceB {

    override fun eat() {
        super<MyInterfaceA>.walk()
        super<MyInterfaceB>.walk()
    }

    override fun walk() {
        super.eat()
    }

}



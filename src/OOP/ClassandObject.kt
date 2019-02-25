package OOP


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 24.02.2019 - 19:58          │
└─────────────────────────────┘
 */

class myClass {

    // property | data member
    var name: String = "Okan AYDIN"

    // print function
    fun printMe() {
        print("My name is: $name")
    }
}

fun main() {

    // create myObj object of myClass class
    val myObj = myClass()

    // print myObj
    myObj.printMe()

}
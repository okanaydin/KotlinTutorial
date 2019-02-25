package OOP


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 25.02.2019 - 15:04          │
└─────────────────────────────┘
 */

fun main() {

    // var bike = Vehicle("Bianchi","blue")   // You cannot create instance of abstract class

    val car = Car("Audi", "Black", 340)
    val motorCycle = Motorcycle("BMW", "Red", 260)

    car.printDetails()
    motorCycle.printDetails()

    car.start()
    motorCycle.start()

}

abstract class Vehicle(
    val name: String,
    val color: String
) {

    abstract var maxSpeed: Int

    abstract fun start()

    abstract fun stop()

    fun printDetails() {
        println("Vehicle Name: $name, Color: $color, Max Speed: $maxSpeed")
    }
}


class Car(
    name: String,
    color: String,
    override var maxSpeed: Int
) : Vehicle(name, color) {

    override fun start() {
        println("car started")
    }

    override fun stop() {
        println("car stopped")
    }
}


class Motorcycle(
    name: String,
    color: String,
    override var maxSpeed: Int
) : Vehicle(name, color) {

    override fun start() {
        println("motorcycle started")
    }

    override fun stop() {
        println("motorcycle stopped")
    }
}


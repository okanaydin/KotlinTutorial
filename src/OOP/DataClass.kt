package OOP


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 25.02.2019 - 16:07          │
└─────────────────────────────┘
 */

data class CarDTO constructor(

    val brand: String,
    val color: String,
    val price: Int

)

fun main() {

    val car1 = CarDTO("Audi", "Red", 2_000_000)  // you can use 2_000_000 instead of 2000000
    val car2 = CarDTO("BMW", "Blue", 3_000_000)  // both the same
    val car3 = CarDTO("Volvo", "White", 4_000_000)

    println("Car 1: ${car1.brand} ${car1.color} ${car1.price}")
    println("Car 2: ${car2.brand} ${car2.color} ${car2.price}")
    println("Car 3: ${car3.brand} ${car3.color} ${car3.price}")
}

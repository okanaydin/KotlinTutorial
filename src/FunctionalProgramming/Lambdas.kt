package FunctionalProgramming


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 25.02.2019 - 17:03          │
└─────────────────────────────┘
 */

fun main() {

    val helloText = { println("Hello World!") }

    helloText()         // invoking function


    //Lambda with parameters

    val sum = { a: Int, b: Int -> a + b }
    val result = sum(10, 5)

    println(result)

}
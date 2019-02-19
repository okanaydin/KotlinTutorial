package ControlFlowStatements


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 20.02.2019 - 01:40          │
└─────────────────────────────┘
 */

fun main() {

    val x = 2

    when (x) {

        0 -> println("x is 0")
        1 -> println("x is 1")
        2 -> println("x is 2")

        in 3..100 -> print("")
        else -> println("x value is unknown")
    }
}
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


    var range1 = 1..5 // this range contains number 1, 2, 3, 4, 5
    println(range1.first) // 1

    val range2 = 5 downTo 1 // this range contains number 5, 4, 3, 2, 1
    println(range2.first) // 5

    var range3 = 1 downTo 5 step 2 // this range contains the number 1,3,5
    println(range3.first) // 1

    val range4 = 'a'..'z' // This range contains the values from "a", "b", "c" . . . "z"
    println(range4.last) // z

    var isPresent = 'k' in range4
    println(isPresent) // true

    var countDown = 20.downTo(10) // This range contains number 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10
    println(countDown.last) // 10

}
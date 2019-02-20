package Functions


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 20.02.2019 - 16:37          │
└─────────────────────────────┘
 */

fun main() {

    var sumResult = 9.sum(4) // 9+4=13
    println(sumResult)

    var sumResult2 = 10.sum(5).sum(5) // 10+5+5=20
    println(sumResult2)

}

fun Int.sum(value: Int): Int = this + value
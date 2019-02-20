package Functions


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 20.02.2019 - 16:40          │
└─────────────────────────────┘
 */


fun main() {

    var fullName = "Okan " add "Aydın"
    println(fullName)

    var sum = 2 add2 5
    println(sum)

}

//infix functions example-1
infix fun String.add(name: String): String = this + name

//infix functions example-2
infix fun Int.add2(number: Int): Int = this + number
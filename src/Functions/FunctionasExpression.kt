package Functions


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 20.02.2019 - 16:39          │
└─────────────────────────────┘
 */


fun main() {

    var userName = getName("Okan", "AYDIN")

    println(userName)

}

fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

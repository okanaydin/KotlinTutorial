package Functions


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 20.02.2019 - 16:02          │
└─────────────────────────────┘
 */

fun main() {

    var result = calculateArea(length = 2, width = 5)

    print(result)

}

fun calculateArea(length: Int, width: Int, height: Int = 10): Int {

    return length * width * height
}



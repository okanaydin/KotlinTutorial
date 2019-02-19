package LoopControlStatements


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 20.02.2019 - 01:44          │
└─────────────────────────────┘
 */

fun main() {

    // 1. example
    for (i in 0..40) {
        print("x:$i ") // x:0 x:1 x:2 ...... x:40
    }

    // 2. example
    for (i in 0..40 step 2) {
        print("x:$i ") // x:0 x:2 x:4 ...... x:40
    }

}
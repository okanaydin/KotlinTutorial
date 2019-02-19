package LoopControlStatements


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 20.02.2019 - 01:46          │
└─────────────────────────────┘
 */

fun main() {

    for (i in 0..10) {
        if (i == 5)
            continue
        println(i)  //print 0 1 2 3 4 5 6 7 8 9 10
    }

}
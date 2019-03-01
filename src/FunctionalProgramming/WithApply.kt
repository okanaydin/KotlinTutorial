package FunctionalProgramming


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 01.03.2019 - 19:18          │
└─────────────────────────────┘
 */

fun main() {

    var student = Student()

    with(student) {
        name = "Okan AYDIN"
        id = 1001
    }

    println("${student.id} ${student.name} ")



    student.apply {
        name = "OKAN AYDIN"
        id = 1002
    }.talk()

    println("${student.id} ${student.name} ")
}


class Student {

    var name: String = ""
    var id: Int = -1

    fun talk() {
        println("I'm a student")
    }
}

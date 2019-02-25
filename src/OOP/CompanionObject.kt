package OOP


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 25.02.2019 - 16:37          │
└─────────────────────────────┘
 */

fun main() {

    println(StudentClass.id)

    StudentClass.nameOfStudent()
}

class StudentClass {

    companion object {

        var id: Int = 1001      // behaves like STATIC variable
        var name: String = "Okan AYDIN"

        @JvmStatic
        fun nameOfStudent() {   // behaves like STATIC method
            print(name)
        }
    }
}
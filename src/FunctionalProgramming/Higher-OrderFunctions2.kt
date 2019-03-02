package FunctionalProgramming


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 02.03.2019 - 11:52          │
└─────────────────────────────┘
 */

fun main() {

    numberToString("Isik University",
        higherOrderFunction1 = { schoolNumber: Int, name: String, surname: String -> },
        higherOrderFunction2 = { schoolNumber: Int, name: String, surname: String -> }
    )
}

fun numberToString(
    schoolName: String,
    higherOrderFunction1: (schoolNumber: Int, name: String, surname: String) -> Unit,
    higherOrderFunction2: (Int, String, String) -> Unit
) {

    println("Hello")
    print("School Name: $schoolName")
    higherOrderFunction1(1240, "Okan ", "AYDIN")
    higherOrderFunction2(1241, "Oktay", "Yilmaz")

}
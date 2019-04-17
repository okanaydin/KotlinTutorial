package CollectionsProgramming


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 17.04.2019 - 12:02          │
└─────────────────────────────┘
 */

fun main() {

    // Example 1
    var hashSet = HashSet<Int>().also {
        it.add(2)
        it.add(13)
        it.add(6)
        it.add(5)
        it.add(3)
        it.add(8)
        it.remove(6)
        it.remove(13)
    }

    for (element in hashSet) println(element)


    // Example 2

    var hashSet2 = HashSet<String>(6)
    hashSet2.add("Apple")
    hashSet2.add("Google")
    hashSet2.add("Amazon")
    hashSet2.add("Facebook")
    hashSet2.add("Instagram")
    hashSet2.remove("Amazon")

    for (element in hashSet2) println(element)


}
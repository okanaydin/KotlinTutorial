package OOP


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 24.02.2019 - 20:21          │
└─────────────────────────────┘
 */


//primary constructor
class News constructor(newsID: Int) {

    //secondary constructor
    constructor(
        newsID: Int,
        newsURL: String,
        newsTitle: String
    ) : this(1000)

}

fun main() {

    val newsInstance1: News = News(1001)

    val newsIntance2: News? = null

    val newsIntance3: News = News(1002, "Magazine", "Bob is dead")

    val newsIntance4: News = News(newsID = 1002, newsURL = "Magazine", newsTitle = "Bob is dead")

}
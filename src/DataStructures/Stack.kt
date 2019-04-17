package DataStructures


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 17.04.2019 - 12:29          │
└─────────────────────────────┘
 */

class Stack {

    var stackArray = IntArray(10)
    var top = 0


    fun push(data: Int) {                // add element

        if (top == 9) println("Stack is full")

        stackArray[top] = data
        top++
    }

    fun peek(): Int = stackArray[top]


    fun pop(): Long {               //delete element

        if (isEmpty()) println("Stack is empty")

        val data: Int
        top--
        data = stackArray[top]
        stackArray[top] = 0
        return data.toLong()
    }

    fun show() {
        for (n in stackArray) print("$n ")
    }

    fun size(): Int = top


    fun isEmpty(): Boolean = top <= 0


}


fun main() {

    val myStack = Stack().apply {

        show() // 0 0 0 0 0 0 0 0 0 0
        println()

        push(10)
        push(20)
        push(30)
        push(40)
        push(50)
        push(60)
        push(70)
        peek()
        pop()

        show() // 10 20 30 40 50 60 0 0 0 0
        println()

        pop()
        pop()
        push(80)
        push(85)
        show() // 10 20 30 40 80 85 0 0 0 0
        println()


        push(90)
        push(100)
        push(110)

        show() // 10 20 30 40 80 85 90 100 110 0

        push(120)  // Stack is full

    }

}




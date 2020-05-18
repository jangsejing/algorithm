package hackerrank

import kotlin.collections.*
import kotlin.io.*

// Complete the hackerrank.breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {

    var low = 0
    var high = 0
    val board = arrayOf(0, 0)

    scores.forEachIndexed { index, i ->

        if (index == 0) {
            low = i
            high = i
        }

        if (high < i) {
            high = i
            board[0] = ++board[0]
        }

        if (low > i) {
            low = i
            board[1] = ++board[1]
        }

        println("$i $low $high")
    }
    println(board.toString())

    return board
}

fun main(args: Array<String>) {

    val scores = arrayOf(0, 9, 3, 10, 2, 20)
    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}

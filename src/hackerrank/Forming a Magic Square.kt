package hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.math.min

// Complete the hackerrank.formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {

    val square = arrayOf(
        arrayOf(arrayOf(8, 1, 6), arrayOf(3, 5, 7), arrayOf(4, 9, 2)),
        arrayOf(arrayOf(6, 1, 8), arrayOf(7, 5, 3), arrayOf(2, 9, 4)),
        arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 6)),
        arrayOf(arrayOf(2, 9, 4), arrayOf(7, 5, 3), arrayOf(6, 1, 8)),
        arrayOf(arrayOf(8, 3, 4), arrayOf(1, 5, 9), arrayOf(6, 7, 2)),
        arrayOf(arrayOf(4, 3, 8), arrayOf(9, 5, 1), arrayOf(2, 7, 6)),
        arrayOf(arrayOf(6, 7, 2), arrayOf(1, 5, 9), arrayOf(8, 3, 4)),
        arrayOf(arrayOf(2, 7, 6), arrayOf(9, 5, 1), arrayOf(4, 3, 8))
    )

    var sum = -1
    square.forEach {
        var check = 0
        it.forEachIndexed { i, d2 ->
            d2.forEachIndexed { j, valJ ->
                check += abs(valJ - s[i][j])
            }
        }
        sum = if (sum == -1) check else min(check, sum)
    }
    return sum
}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })
//
//    for (i in 0 until 3) {
//        sarrayOf(i) = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
//    }

    val s = arrayOf(
        arrayOf(4, 9, 2),
        arrayOf(3, 5, 7),
        arrayOf(8, 1, 5)
    )

    val result = formingMagicSquare(s)

    println("result $result")
}

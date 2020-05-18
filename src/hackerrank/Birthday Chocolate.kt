package hackerrank

import kotlin.io.*
import kotlin.ranges.*

// Complete the hackerrank.birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // d = 합계
    // m = 조각의 갯수
    var result = 0
    for (i in 0..(s.size) - m) {
        var sum = 0
        for (j in i until i + m) {
            print("${s[j]} ")
            sum += s[j]
        }

        if (sum == d) {
            result = result.inc()
        }
    }

    return result
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val dm = readLine()!!.trimEnd().split(" ")
//
//    val d = dm[0].toInt()
//
//    val m = dm[1].toInt()

    val s = arrayOf(1, 2, 1, 3, 2)
    val d = 3
    val m = 2

    val result = birthday(s, d, m)

    println(result)
}

package hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*

// Complete the hackerrank.divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var count = 0
    ar.forEachIndexed { index, i ->
        for (j in index + 1 until ar.size) {
            if ((i + ar[j]) % k == 0) count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val n = 6
    val k = 3
    val ar = arrayOf(1, 3, 2, 6, 1, 2)
    val result = divisibleSumPairs(n, k, ar)

    println(result)
}

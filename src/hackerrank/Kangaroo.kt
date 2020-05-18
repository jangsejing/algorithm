package hackerrank

import kotlin.io.*

// Complete the hackerrank.kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    return if (v1 > v2 && ((x2 - x1) % (v1 - v2) == 0)) {
        "YES"
    } else {
        "NO"
    }
}

fun main(args: Array<String>) {
    val result = kangaroo(21, 6, 47, 3)
    println(result)
}

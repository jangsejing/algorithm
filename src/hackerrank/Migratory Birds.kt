package hackerrank

import kotlin.collections.*
import kotlin.io.*

// Complete the hackerrank.migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    arr.sort()

    val map = mutableMapOf<Int, Int>()
    arr.forEach {
        var value = map[it] ?: 0
        map[it] = ++value
    }

    var max = 0
    var birds = 0
    map.forEach { (k, v) ->
        if (max < v && birds < k) {
            max = v
            birds = k
        }
    }
    return birds
}

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)
    val result = migratoryBirds(arr)

    println(result)
}

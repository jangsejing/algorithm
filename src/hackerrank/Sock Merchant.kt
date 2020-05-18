package hackerrank

import kotlin.collections.*
import kotlin.io.*

// Complete the hackerrank.sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    ar.forEach {
        var value = map[it] ?: 0
        map[it] = ++value
    }
    println(map)

    var count = 0
    map.forEach { (t, u) ->
        count += u / 2
    }

    return count
}

fun proc(value: Int): Int {
    var data = value
    var count = 0

    return value / 2
//    return if (value % 2 == 0) {
//        value / 2
//    } else {
//
//        while (data > 1) {
//            data /= 2
//            ++count
//        }
//        count
//    }
}


fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)

//    val n = scan.nextLine().trim().toInt()

//    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val ar = arrayOf(4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5)
    val result = sockMerchant(9, ar)

    println(result)
}

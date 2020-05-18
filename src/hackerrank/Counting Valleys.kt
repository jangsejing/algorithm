package hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the hackerrank.countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    // 지면에서 아래로 내려갔다가 올라왔을 경우 1계곡이라함

    val list = s.split("").filter { it.isNotEmpty() }
    var filed = 0 // 지표면
    var count = 0
    var isUp: Boolean
    list.forEach {
        isUp = filed > 0
        when (it) {
            "U" -> filed += 1
            "D" -> filed -= 1
        }

        if (!isUp && filed == 0) {
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val n = scan.nextLine().trim().toInt()
//
//    val s = scan.nextLine()

    val result = countingValleys(8, "UDDDUDUU")

    println(result)
}

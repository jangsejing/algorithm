package hackerrank

import kotlin.collections.*
import kotlin.io.*

// Complete the hackerrank.bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    // bill : 청구서 금액
    // k : bill 중 안나가 먹지 않은 금액의 인덱스
    // b : 안나가 청구한 금액
    val result = b - bill.filterIndexed { index, i -> index != k }.sum().div(2)
    println(
        if (result < 1) {
            "Bon Appetit"
        } else {
            result
        }
    )
}

fun main(args: Array<String>) {
//    val nk = readLine()!!.trimEnd().split(" ")
//
//    val n = nk[0].toInt()
//
//    val k = nk[1].toInt()
//
//    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val b = readLine()!!.trim().toInt()

    val bill = arrayOf(3, 10, 2, 9)
    bonAppetit(bill, 1, 12)
}

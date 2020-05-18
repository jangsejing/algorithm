package hackerrank

import kotlin.math.min

/*
 * Complete the hackerrank.pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {
    // n : 전체 페이지 수
    // p : 펼칠 페이지 수
    // 앞으로 넘기나 뒤로 넘기나 최소 넘기는 페이지 수

    // 홀수 페이지 : 맨 뒷장 공백 페이지 없음
    // 짝수 페이지 : 맨 뒷장 공백 페이지 있음

    val valN = n / 2
    val nalP = p / 2
    return min(nalP, valN - nalP)

}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val n = scan.nextLine().trim().toInt()
//
//    val p = scan.nextLine().trim().toInt()

    val result = pageCount(5, 4)

    println(result)
}

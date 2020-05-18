package hackerrank

import kotlin.io.*
import kotlin.math.abs

// Complete the hackerrank.catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    // x : catA
    // y : catB
    // z : MouseC

    // 누가 더 쥐와 가까운지 계산
    // 둘다 가까우면 마우스로 리턴

    val a = abs(x - z)
    val b = abs(y - z)
    return when {
        a > b -> {
            "Cat B"
        }
        a < b -> {
            "Cat A"
        }
        else -> {
            "Mouse C"
        }
    }
}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val q = scan.nextLine().trim().toInt()
//
//    for (qItr in 1..q) {
//        val xyz = scan.nextLine().split(" ")
//
//        val x = xyz[0].trim().toInt()
//
//        val y = xyz[1].trim().toInt()
//
//        val z = xyz[2].trim().toInt()
//
//        val result = hackerrank.catAndMouse(x, y, z)
//
//        println(result)
//    }


    println(catAndMouse(1, 2, 3))
    println(catAndMouse(1, 3, 2))
}

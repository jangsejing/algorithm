package hackerrank

import kotlin.io.*
import kotlin.text.*

// Complete the hackerrank.dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    when {
        year > 1918 -> {
            // 그레고리 달력
            return if (year % 400 == 0) {
                // 윤년
                "12.09.$year"
            } else if (year % 4 == 0 && year % 100 != 0) {
                // 윤년
                "12.09.$year"
            } else {
                // 평년
                "13.09.$year"
            }
        }
        year < 1918 -> {
            return if (year % 4 == 0) {
                // 윤년
                "12.09.$year"
            } else {
                // 평년
                "13.09.$year"
            }
        }
        else -> {
            // 1918년
            return "26.09.$year"
        }
    }
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(1800)

    println(result)
}

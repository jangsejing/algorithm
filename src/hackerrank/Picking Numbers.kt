import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here


    val list = arrayListOf<Int>()
    a.forEach { i ->

        val lowList = arrayListOf<Int>()
        val upList = arrayListOf<Int>()
        a.forEach { j ->
            // 18 기준이면, 17도 될수 있고 19도 될 수 있다.
            val check = i - j
            if (abs(check) <= 1) {
                if (j <= i) {
                    upList.add(j)
                }

                if (j >= i) {
                    lowList.add(j)
                }
            }
        }

        val compare = if (lowList.size < upList.size) {
            upList
        } else {
            lowList
        }

        if (list.size < compare.size) {
            list.run {
                clear()
                addAll(compare)
            }
        }
    }

    return list.size
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val value =
        "7 12 13 19 17 7 3 18 9 18 13 12 3 13 7 9 18 9 18 9 13 18 13 13 18 18 17 17 13 3 12 13 19 17 19 12 18 13 7 3 3 12 7 13 7 3 17 9 13 13 13 12 18 18 9 7 19 17 13 18 19 9 18 18 18 19 17 7 12 3 13 19 12 3 9 17 13 19 12 18 13 18 18 18 17 13 3 18 19 7 12 9 18 3 13 13 9 7"
    val a = value.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()
    val result = pickingNumbers(a)

    println(result)
}

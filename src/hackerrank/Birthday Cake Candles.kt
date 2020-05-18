package hackerrank/*
 * Complete the 'hackerrank.getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here

    val lcm = getLcm(a)
    print(lcm)
    val gcd = getGcd(b)
    print(gcd)

    var count = 0
    var index = 1
    var comp = 0

    while (comp < gcd) {
        comp = lcm * index
        if (gcd % comp == 0) {
            count++
        }
        index++
    }

    return count

}

/**
 * 최대 공배수
 */
fun getLcm(a: Array<Int>): Int {
    var result: Int = a[0]
    for (i in 1 until a.size) {
        result = lcm(result, a[i])
    }
    return result
}

/**
 * 최대 공배수
 */
fun lcm(a: Int, b: Int): Int {
    return a * (b / gcd(a, b));
}

/**
 * 최대 공약수
 */
fun getGcd(b: Array<Int>): Int {
    var result = b[0]
    for (i in 1 until b.size) {
        result = gcd(result, b[i])
    }
    return result
}

/**
 * 최대 공약수
 * 유클리드 호제법
 *
 * @param valA 기준값
 */
fun gcd(valA: Int, valB: Int): Int {
    var a = valA
    var b = valB

    if (b > a) {
        val temp = b
        b = a
        a = temp
    }

    while (b > 0) {
        val c = a % b
        a = b
        b = c
    }
    return a
}


fun main(args: Array<String>) {

    val arr = arrayOf(2, 4)
    val brr = arrayOf(16, 32, 96)
    val total = getTotalX(arr, brr)

    println(total)
}

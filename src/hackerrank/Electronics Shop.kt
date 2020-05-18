package hackerrank

/*
 * Complete the hackerrank.getMoneySpent function below.
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    /*
     * Write your code here.
     */
//    키보드 가격들 : 3 1
//    드라이버 가격들 : 5 2 8
//    예산 : 10

    var total = 0
    keyboards.forEach { k ->
        drives.forEach { d ->
            val money = k + d
            if(money in (total + 1)..b) {
                total = money
            }
        }
    }

    return if (total > 0) {
        total
    } else {
        -1
    }
}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val bnm = scan.nextLine().split(" ")
//
//    val b = bnm[0].trim().toInt()
//
//    val n = bnm[1].trim().toInt()
//
//    val m = bnm[2].trim().toInt()
//
//    val keyboards = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
//
//    val drives = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
//
//    /*
//     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
//     */

    val keyboards = arrayOf(3, 1)
    val drives = arrayOf(5, 2, 8)
    val b = 10
    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}

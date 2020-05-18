package hackerrank

import java.text.SimpleDateFormat
import java.util.*


/*
 * Complete the hackerrank.timeConversion function below.
 */
fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */
    val inputDateFormat = SimpleDateFormat("hh:mm:ssaa")
    val outputDateFormat = SimpleDateFormat("HH:mm:ss")

    val date= inputDateFormat.parse(s);
    return outputDateFormat.format(date)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}

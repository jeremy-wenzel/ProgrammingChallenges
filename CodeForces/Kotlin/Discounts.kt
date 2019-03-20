import java.io.PrintWriter
import java.util.*

/**
 * I found out the problem was with the println method. It was taking too long to print
 * everything. I also need to use a long as numbers could get really big
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val out = PrintWriter(System.out)
    val n = scanner.nextInt()
    val bars = IntArray(n)
    var totalCost = 0L
    for (i in 0 until n) {
        bars[i] = scanner.nextInt()
        totalCost += bars[i]
    }
    // Sort the bars
    bars.sort()
    val m = scanner.nextInt()
    for (i in 0 until m) {
        val coupon = scanner.nextInt()
        out.println(totalCost - bars[bars.size - coupon])
    }
    out.flush()
}
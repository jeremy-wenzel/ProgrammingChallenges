import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n)

    for (i in 0..(n - 1))
        arr[i] = scanner.nextInt()

    var numPositive = 0
    var numNegative = 0
    for (x in arr) {
        if (x > 0) numPositive++
        else if (x < 0) numNegative++
    }

    if (numPositive >= Math.ceil(n / 2.0)) print(1)
    else if (numNegative >= Math.ceil(n / 2.0)) print(-1)
    else print(0)
}
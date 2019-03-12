import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt() - 1
    for (i in 0..n) {
        val left = scanner.nextInt()
        val right = scanner.nextInt()
        val divisor = scanner.nextInt()
        var min = divisor
        if (!isOutOfBounds(left, right, min)) {
            min = ((right / divisor) + 1) * divisor
        }
        println(min)
    }
}

fun isOutOfBounds(left: Int, right: Int, value: Int) : Boolean {
    return value < left || value > right
}
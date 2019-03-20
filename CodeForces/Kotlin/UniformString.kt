import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()
    for (i in 0 until t) {
        val n = scanner.nextInt()
        val k = scanner.nextInt()
        val sb = StringBuilder()
        for (j in 0 until n) {
            sb.append((97 + (j % Math.min(k, 26))).toChar())
        }
        println(sb.toString())
    }
}
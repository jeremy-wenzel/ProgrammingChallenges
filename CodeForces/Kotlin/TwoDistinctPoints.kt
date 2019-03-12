import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>){
    val scan = Scanner(System.`in`)
    val n = scan.nextInt() - 1
    for (i in 0..n) {
        val left1 = scan.nextInt()
        val right1 = scan.nextInt()
        val left2 = scan.nextInt()
        val right2 = scan.nextInt()

        val sb = StringBuilder()
        if (left1 != right2) {
            sb.append(left1)
            sb.append(" ")
            sb.append(right2)
        }
        else {
            sb.append(right1)
            sb.append(" ")
            sb.append(left2)
        }

        println(sb.toString())
    }
}
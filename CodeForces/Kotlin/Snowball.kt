import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var ballWeight = scanner.nextInt()
    val ballHeight = scanner.nextInt()

    val stoneOneWeight = scanner.nextInt()
    val stoneOneHeight = scanner.nextInt()
    val stoneTwoWeight = scanner.nextInt()
    val stoneTwoHeight = scanner.nextInt()

    for (currentHeight in ballHeight downTo 1) {
        ballWeight += currentHeight

        if (stoneOneHeight == currentHeight) {
            ballWeight -= stoneOneWeight
        }
        if (stoneTwoHeight == currentHeight) {
            ballWeight -= stoneTwoWeight
        }

        if (ballWeight < 0)
            ballWeight = 0
    }

    print (ballWeight)
}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // Get the input
    var andrew = scanner.nextInt()
    var dmitry = scanner.nextInt()
    var michal = scanner.nextInt()

    var green = scanner.nextInt()
    var purple = scanner.nextInt()
    var black = scanner.nextInt()

    // Make sure enough green grapes for Andrew
    if (green < andrew) {
        printNo()
        return
    }

    // Subtract Andrew grapes needed from green grapes
    green -= andrew

    // Check if enough green and purple grapes for Dmitry
    if ((green + purple) < dmitry) {
        printNo()
        return
    }

    // Subtract Dmitry needed from green then purple grapes
    if (green < dmitry) {
        dmitry -= green
        green = 0
        purple -= dmitry
    }
    else {
        green -= dmitry
    }

    if ((green + purple + black) < michal) {
        printNo()
        return
    }

    print("YES")
}

fun printNo() {
    print("NO")
}
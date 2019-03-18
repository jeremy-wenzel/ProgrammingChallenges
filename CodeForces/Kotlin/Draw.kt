import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var numDraws = 1
    var scoreA = 0
    var scoreB = 0
    for(i in 0..n-1) {
        var newA = scanner.nextInt()
        var newB = scanner.nextInt()
        var diffA = newA - scoreA
        var diffB = newB - scoreB

//        if (newA >= scoreB && newB >= scoreA) {
            while (true) {
                if (diffA <= 0 || diffB <= 0) {
                    break
                }
                if (scoreA < scoreB) {
                    scoreA++
                    diffA--
                } else if (scoreB < scoreA) {
                    scoreB++
                    diffB--
                } else if (scoreA == scoreB) {
                    scoreA++
                    scoreB++
                    diffA--
                    diffB--
                }

                if (scoreA == scoreB) {
                    numDraws++
                }


            }
//        }
        scoreA = newA
        scoreB = newB
    }

    print(numDraws)
}
import java.lang.String.format
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var line = scanner.nextLine().split(":")
    val hour1 = line[0].toInt()
    val min1 = line[1].toInt()

    line = scanner.nextLine().split(":")
    val hour2 = line[0].toInt()
    val min2 = line[1].toInt()

    var totalHours = hour2 - hour1
    var totalMins = min2 - min1

    if (totalMins < 0) {
        totalHours--
        totalMins += 60
    }

    // Get the midTotalMinutes
    var midTotalMin = (totalMins + (60 * totalHours)) / 2
    var midHours = hour1 + (midTotalMin / 60)
    var midMin = min1 + (midTotalMin % 60)

    if (midMin >= 60) {
        midHours++
        midMin %= 60
    }


    print(format("%02d:%02d", midHours, midMin))
}
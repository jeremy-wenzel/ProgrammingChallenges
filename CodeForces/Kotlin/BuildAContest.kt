import java.lang.StringBuilder
import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val creationString = StringBuilder()
    val hashMap = HashMap<Int, Int>()
    for(i in 0 until m) {
        val difficulty = scanner.nextInt()
        if (hashMap.contains(difficulty)) {
            var value = hashMap[difficulty]!!
            hashMap[difficulty] = ++value
        }
        else {
            hashMap[difficulty] = 1
        }

        if (hashMap.size >= n) {
            for (i in 1 until n + 1) {
                if (hashMap.containsKey(i)) {
                    if (hashMap[i] == 1) {
                        hashMap.remove(i)
                    } else {
                        var value = hashMap[i]!!
                        hashMap[i] = --value
                    }
                }
            }
            creationString.append(1)
        }
        else {
            creationString.append(0)
        }
    }

    print(creationString.toString())
}
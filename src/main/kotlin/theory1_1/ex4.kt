package theory1_1

import kotlin.math.max
import kotlin.math.min

fun main() {
    val (k, x, y) = readln().split(" ").map { it.toInt() }
    val maxi = max(x, y); val mini = min(x, y);
    if (maxi >= k) {
        if (maxi - mini >= 2) println(0)
        else println(2 - max(x, y) + min(x, y))
    }
    else {
        if (k - mini >= 2) println(k - maxi)
        else println(2)
    }
}
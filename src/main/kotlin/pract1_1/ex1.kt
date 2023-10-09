package pract1_1

import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main() {
    val (a, b, c ,d) = readln().split(" ").map { it.toDouble() };
    if (max(a, b) >= max(c, d) && min(a, b) >= min(a, b)) println("YES")
    else println("NO")
}
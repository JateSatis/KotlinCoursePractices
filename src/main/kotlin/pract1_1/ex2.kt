package pract1_1

fun main() {
    val line = readln()
    var (a, t, g, c) = intArrayOf(0, 0, 0, 0)
    for (char in line) {
        when (char) {
            'A' -> a++
            'T' -> t++
            'G' -> g++
            'C' -> c++
        }
    }

    println("$a $t $g $c")
}
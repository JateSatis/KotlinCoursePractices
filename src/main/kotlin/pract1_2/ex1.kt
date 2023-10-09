package pract1_2

val countVowels = {line: String ->
    var sum = 0
    for (char in line) {
        sum += when(char) {
            'a', 'e', 'i', 'o', 'u' -> 1
            else -> 0
        }
    }
    sum
}

fun main() {
    println(countVowels("hello world! how are you?"))
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    add(24, 4)
    area(45, 30)
    temp("20°C")
    var start = 40
    var end = 60
    var sum = sumEvenNumbers(start, end)
    println("the sum of even numbers from $start to $end: $sum")
    var range = 1..100
    var evennums = range.filter { it % 2 == 0 }
    var result = evennums.sum()
    println(evennums)
    println(result)
    var result1 = evennums.max()
    var result2 = evennums.min()
    println(result1)
    println(result2)

}

fun add(num1: Int, num2: Int) {
    var radd = num1 + num2
    var rsub = num1 - num2
    var rmultiply = num1 * num2
    var rdivide = num1 / num2
    println(radd)
    println(rsub)
    println(rmultiply)
    println(rdivide)
    val degree: Char = '\u00B0'
    println(degree)

}

fun area(len: Int, wid: Int) {
    var area = len * wid
    println(area)
}

fun temp(temperature: String) {
    val temperature = "24 \u00B0 C"
    println(temperature)

// public const val degree: Char = '\u00B0'

}

fun sumEvenNumbers(start: Int, end: Int): Int {
    if (start > end) {
        return 0
    }
    return if (start % 2 == 0) {
        start + sumEvenNumbers(start + 2, end)
    } else {
        start + sumEvenNumbers(start + 1, end)
    }

}
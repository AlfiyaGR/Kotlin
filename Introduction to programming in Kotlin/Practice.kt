fun main() {
    println(compareNumbers(300, 250))
    println(compareNumbers(300, 300))
    println(compareNumbers(200, 220))
}

fun compareNumbers(timeSpentToday: Int, timepentYesterday: Int): Boolean {
    return timeSpentToday > timepentYesterday
}

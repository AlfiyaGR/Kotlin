fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = sub(firstNumber, secondNumber)
    val anotherResult = sub(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun sub(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

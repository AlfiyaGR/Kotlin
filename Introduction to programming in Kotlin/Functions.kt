fun main() {
    println(birthdayGreeting(age = 5, name = "Rover"))
    println(birthdayGreeting(name = "Rex", age = 2))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

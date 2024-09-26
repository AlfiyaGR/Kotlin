fun main() {
    println(weather("Ankara", "27", "31", "82"))
    println(weather("Tokyo", "32", "36", "10"))
    println(weather("Cape Town", "59", "64", "2"))
    println(weather("Guatemala City", "50", "55", "7"))
}

fun weather(city: String, lowTemp: String, highTemp: String, chanceOfRain: String): String {
    var city = "City: $city\n"
    var temp = "Low temperature: $lowTemp, High temperature: $highTemp\n"
    var rain = "Chance of rain: $chanceOfRain%\n"
    return city + temp + rain
}

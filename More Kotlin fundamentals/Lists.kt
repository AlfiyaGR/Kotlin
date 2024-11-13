fun main() {
    val solarSystem = mutableListOf(
        "Mercury", "Venus", "Earth", "Mars", "Jupiter",
        "Saturn", "Uranus", "Neptune")
    
    println(solarSystem.size) 
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    
    for (planet in solarSystem) {
    	println(planet)
	}
}

class SmartDevice {
    fun turnOn() {
        // A valid use case to call the turnOff() method could be to turn off the TV when available power doesn't meet the requirement.
        turnOff()
        println("Smart device is turned on.")
    }
    
    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

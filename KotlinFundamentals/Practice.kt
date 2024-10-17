fun main() {    
    val mySong = Song("Run", "BTS", 2015, 137_330_300)
    mySong.printDescription()
    println(mySong.isPopular)
}


class Song(
    val title: String, 
    val artist: String, 
    val yearPublished: Int, 
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }   
}

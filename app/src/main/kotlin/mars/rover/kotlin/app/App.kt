/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package mars.rover.kotlin.app

class Mars constructor(x: Int, y: Int, direction: String){
    var position = Coordinate(x, y)
    var direction = direction
    fun forward(){
        position.x += 1
    }
    fun backward(){
        if (direction == "West"){
            position.y += 1
            position.x += 0
        } else if (direction == "North"){
            position.y += 0
            position.x += 1
        }
    }
    fun left(){
        if (direction == "South"){
            direction = "East"
        } else if (direction == "East"){
            direction = "North"
        } else if (direction == "North"){
            direction = "West"
        } else direction = "South"
    }
    fun right(){
        if (direction == "South"){
            direction = "West"
        } else if (direction == "West"){
            direction = "North"
        } else if (direction == "North"){
            direction = "East"
        } else direction = "South"
    }
}

fun main(){
    val mars = Mars(0, 0, "North") //creame un objeto a partir de esta clase
    val mars2 = Mars(direction = "West", x = 1, y = 3) // otro objeto
    mars.backward()
    mars2.backward()
    mars2.backward()
    println(mars.position)
    println(mars2.position)

}

class Coordinate(x: Int, y: Int) {
    var x = x
    var y = y
   override fun toString(): String{
       return "${x}, ${y}"
    }
}
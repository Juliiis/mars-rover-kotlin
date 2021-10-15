package mars.rover.kotlin.app

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MarsTest {
   @Test fun turnLeft(){
        Mars.left()
        var actualDireccion = Mars.direction
        assertEquals("East", actualDireccion)
    }
}
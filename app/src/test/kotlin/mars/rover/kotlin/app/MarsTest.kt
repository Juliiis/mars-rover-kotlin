package mars.rover.kotlin.app

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MarsTest {
   @Test fun turnLeft(){
        var mars = Mars(0,0, "East")
        mars.left()
        var actualDireccion = mars.direction
        assertEquals("North", actualDireccion)
    }
    @Test fun turnBackward(){
        var mars = Mars(0, 0, "West")
        mars.backward() // 0, 1
        var actualColumn = mars.position.y
        assertEquals(1, actualColumn)
    }
}
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
    @Test fun turnBackwardWest(){
        var mars = Mars(0, 0, "West")
        mars.backward() // 0, 1
        var actualColumn = mars.position.y
        assertEquals(1, actualColumn)
    }
    @Test fun turnBackwardNorth(){
        var mars = Mars(0, 0, "North")
        mars.backward() // 1, 0
        var actualRow = mars.position.x
        assertEquals(1, actualRow)
    }
}
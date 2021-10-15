package mars.rover.kotlin.app

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MarsTest {
   @Test fun `turn Left`(){
        var mars = Mars(0,0, "East")
        mars.left()
        var actualDireccion = mars.direction
        assertEquals("North", actualDireccion)
    }
    @Test fun `move Backward Facing West`(){
        var mars = Mars(0, 0, "West")
        mars.backward() // 0, 1
        var actualColumn = mars.position.y
        var actualRow = mars.position.x
        assertEquals(1, actualColumn)
        assertEquals(0, actualRow)
    }
    @Test fun `move Backward Facing North`(){
        var mars = Mars(0, 0, "North")
        mars.backward() // 1, 0
        var actualRow = mars.position.x
        var actualColumn = mars.position.y
        assertEquals(1, actualRow)
        assertEquals(0, actualColumn)
    }
}
package creational

import creational.builder.House
import creational.builder.HouseBuilder
import org.junit.Assert
import org.junit.Test

class HouseBuilderTest {

    @Test
    fun `test HouseBuilder for house with no infrastructure`() {
        var house : House = HouseBuilder().build()

        Assert.assertEquals(house.roomsList.size, 0)
        Assert.assertNotEquals(house.doorsList.size, 1)
        Assert.assertNull(house.tennisCourt)
    }

    @Test
    fun `test HouseBuilder for house with basic infrastructure `(){
        var house : House = HouseBuilder()
            .addRooms(4)
            .addWindows(7)
            .addDoors(8)
            .addTennisCourt()
            .addHelipad()
            .addSwimmingPool()
            .build()

        Assert.assertEquals(house.roomsList.size, 4)
        Assert.assertEquals(house.doorsList.size, 8)
        Assert.assertEquals(house.windowsList.size, 7)
        Assert.assertNotNull(house.tennisCourt)
        Assert.assertNotNull(house.helipad)
        Assert.assertNotNull(house.swimmingPool)
        Assert.assertNull(house.garage)
    }
}
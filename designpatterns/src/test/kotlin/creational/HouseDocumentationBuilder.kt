package creational

import creational.builder.House
import creational.builder.HouseBuilder
import creational.builder.HouseDocumentationBuilder
import org.junit.Assert
import org.junit.Test

class HouseDocumentationBuilderTest {

    @Test
    fun `test HouseDocumentationBuilder for house with no infrastructure`() {
        var documentation : String = HouseDocumentationBuilder().build()
        Assert.assertEquals("", documentation)
    }

    @Test
    fun `test HouseDocumentationBuilder for house with basic infrastructure `(){
        var documentation : String = HouseDocumentationBuilder()
            .addRooms(4)
            .addWindows(7)
            .addDoors(8)
            .addTennisCourt()
            .addHelipad()
            .addSwimmingPool()
            .build()

        Assert.assertEquals("This house has 4 rooms with interior done by Johny Ive." +
                " This house has 7 windows with transparent window pane." +
                " This house has 8 doors with wooden finish." +
                " This house has a tennis court." +
                " This house has a helipad." +
                " This house has a swimming pool. ", documentation)
    }
}
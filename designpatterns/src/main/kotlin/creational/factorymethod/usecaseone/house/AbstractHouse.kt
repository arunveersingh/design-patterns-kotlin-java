package creational.factorymethod.usecaseone.house

import creational.builder.buildingblocks.*

abstract class AbstractHouse {
    val roomsList: MutableList<Room> = mutableListOf()
    val doorsList: MutableList<Door> = mutableListOf()
    val windowsList: MutableList<Window> = mutableListOf()
    var garage: Garage? = null
    var swimmingPool: SwimmingPool? = null
    var helipad: Helipad? = null
    var garden: Garden? = null
    var partyHall: PartyHall? = null
    var amphitheater: Amphitheatre? = null
    var tennisCourt: TennisCourt? = null
}
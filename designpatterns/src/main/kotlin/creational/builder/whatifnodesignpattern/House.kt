package creational.builder.whatifnodesignpattern

import creational.builder.buildingblocks.*

class House(windows: Int,
            doors: Int,
            rooms: Int,
            hasGarage: Boolean = false,
            hasSwimmingPool: Boolean = false,
            hasHelipad: Boolean = false,
            hasGarden: Boolean = false,
            hasPartyHall: Boolean = false,
            hasAmphitheatre: Boolean = false,
            hasTennisCourt: Boolean = false) {

    private val roomsList: MutableList<Room> = mutableListOf()
    private val doorsList: MutableList<Door> = mutableListOf()
    private val windowsList: MutableList<Window> = mutableListOf()
    private val garage: Garage?
    private val swimmingPool: SwimmingPool?
    private val helipad: Helipad?
    private val garden: Garden?
    private val partyHall: PartyHall?
    private val amphitheater: Amphitheatre?
    private val tennisCourt: TennisCourt?



    init {
        for (id in 1..rooms){
            roomsList.add(Room(id))
        }

        for (id in 1..doors){
            doorsList.add(Door(id))
        }

        for (id in 1..windows){
            windowsList.add(Window(id))
        }

        garage = if (hasGarage) Garage(1) else null
        swimmingPool = if (hasSwimmingPool) SwimmingPool(1) else null
        helipad = if (hasHelipad) Helipad(1) else null
        garden = if (hasGarden) Garden(1) else null
        partyHall = if (hasPartyHall) PartyHall(1) else null
        amphitheater = if (hasAmphitheatre) Amphitheatre(1) else null
        tennisCourt = if (hasTennisCourt) TennisCourt(1) else null
    }

    override fun toString(): String {
        return "House(roomsList=$roomsList," +
                " doorsList=$doorsList," +
                " windowsList=$windowsList," +
                " garage=$garage," +
                " swimmingPool=$swimmingPool," +
                " helipad=$helipad," +
                " garden=$garden," +
                " partyHall=$partyHall," +
                " amphitheater=$amphitheater," +
                " tennisCourt=$tennisCourt)"
    }
}

fun main(){
    println(
        House(
            3,
            5,
            6,
            hasGarage = true,
            hasSwimmingPool = true,
            hasHelipad = true,
            hasGarden = true,
            hasAmphitheatre = true,
            hasTennisCourt = true
        )
    )
}
package creational.builder

import creational.builder.buildingblocks.*

class HouseBuilder : Builder<HouseBuilder, House> {

    private val house: House = House()

    override fun addWindows(number: Int): HouseBuilder {
        for (id in 1..number){
            house.windowsList.add(Window(id))
        }
        return this
    }

    override fun addDoors(number: Int): HouseBuilder {
        for (id in 1..number){
            house.doorsList.add(Door(id))
        }
        return this
    }

    override fun addRooms(number: Int): HouseBuilder {
        for (id in 1..number){
            house.roomsList.add(Room(id))
        }
        return this
    }

    override fun addGarage(): HouseBuilder {
        house.garage = Garage(1)
        return this
    }

    override fun addSwimmingPool(): HouseBuilder {
        house.swimmingPool = SwimmingPool(1)
        return this
    }

    override fun addHelipad(): HouseBuilder {
        house.helipad = Helipad(1)
        return this
    }

    override fun addGarden(): HouseBuilder {
        house.garden = Garden(1)
        return this
    }

    override fun addPartyHall(): HouseBuilder {
        house.partyHall = PartyHall(1)
        return this
    }

    override fun addAmphiTheater(): HouseBuilder {
        house.amphitheater = Amphitheatre(1)
        return this
    }

    override fun addTennisCourt(): HouseBuilder {
        house.tennisCourt = TennisCourt(1)
        return this
    }

    override fun build(): House = house
}
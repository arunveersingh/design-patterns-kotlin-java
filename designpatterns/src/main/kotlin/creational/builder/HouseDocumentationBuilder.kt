package creational.builder

class HouseDocumentationBuilder : Builder<HouseDocumentationBuilder, String>  {

    private var documentation : String = ""

    override fun build(): String = documentation

    override fun addWindows(number: Int): HouseDocumentationBuilder {
        documentation += "This house has $number windows with transparent window pane. "
        return this
    }

    override fun addDoors(number: Int): HouseDocumentationBuilder {
        documentation += "This house has $number doors with wooden finish. "
        return this    }

    override fun addRooms(number: Int): HouseDocumentationBuilder {
        documentation += "This house has $number rooms with interior done by Johny Ive. "
        return this
    }

    override fun addGarage(): HouseDocumentationBuilder {
        documentation += "This house has a garage. "
        return this
    }

    override fun addSwimmingPool(): HouseDocumentationBuilder {
        documentation += "This house has a swimming pool. "
        return this
    }

    override fun addHelipad(): HouseDocumentationBuilder {
        documentation += "This house has a helipad. "
        return this
    }

    override fun addGarden(): HouseDocumentationBuilder {
        documentation += "This house has a garden. "
        return this
    }

    override fun addPartyHall(): HouseDocumentationBuilder {
        documentation += "This house has a party hall. "
        return this
    }

    override fun addAmphiTheater(): HouseDocumentationBuilder {
        documentation += "This house has a amphitheater. "
        return this
    }

    override fun addTennisCourt(): HouseDocumentationBuilder {
        documentation += "This house has a tennis court. "
        return this
    }

}

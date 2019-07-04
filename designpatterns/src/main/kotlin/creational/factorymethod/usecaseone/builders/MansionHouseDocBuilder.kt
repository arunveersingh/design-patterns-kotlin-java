package creational.factorymethod.usecaseone.builders

import creational.factorymethod.usecaseone.docs.MansionHouseDoc

class MansionHouseDocBuilder :
    Builder<MansionHouseDocBuilder, MansionHouseDoc> {

    private val details: MansionHouseDoc =
        MansionHouseDoc()

    override fun addWindows(number: Int): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality wood windows \n")
        return this
    }

    override fun addDoors(number: Int): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality wood doors \n")
        return this
    }

    override fun addRooms(number: Int): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality italian finished rooms \n")
        return this
    }

    override fun addGarage(): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality multi vehicle garage \n")
        return this
    }

    override fun addSwimmingPool(): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality swimming pool \n")
        return this
    }

    override fun addHelipad(): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality helipad \n")
        return this
    }

    override fun addGarden(): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality colorful garden \n")
        return this
    }

    override fun addPartyHall(): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality party hall with very good disco lights \n")
        return this
    }

    override fun addAmphiTheater(): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality wood finished amphitheater \n")
        return this
    }

    override fun addTennisCourt(): MansionHouseDocBuilder {
        details.addToDoc("This house has mansion quality wooden tennis court \n")
        return this
    }

    override fun build(): MansionHouseDoc = details

    override fun buildStandard(): MansionHouseDoc {
        return this.addRooms(15).addDoors(35).addAmphiTheater().addHelipad().addGarage().addTennisCourt().build();
    }
}
package creational.factorymethod.builders

import creational.factorymethod.docs.MudHouseDoc

class MudHouseDocBuilder :
    Builder<MudHouseDocBuilder, MudHouseDoc> {

    private val details: MudHouseDoc =
        MudHouseDoc()

    override fun addWindows(number: Int): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality wood windows \n")
        return this
    }

    override fun addDoors(number: Int): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality wood doors \n")
        return this
    }

    override fun addRooms(number: Int): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality italian finished rooms \n")
        return this
    }

    override fun addGarage(): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality multi vehicle garage \n")
        return this
    }

    override fun addSwimmingPool(): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality swimming pool \n")
        return this
    }

    override fun addHelipad(): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality helipad \n")
        return this
    }

    override fun addGarden(): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality colorful garden \n")
        return this
    }

    override fun addPartyHall(): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality party hall with very good disco lights \n")
        return this
    }

    override fun addAmphiTheater(): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality wood finished amphitheater \n")
        return this
    }

    override fun addTennisCourt(): MudHouseDocBuilder {
        details.addToDoc("This house has mud quality wooden tennis court \n")
        return this
    }

    override fun build(): MudHouseDoc = details

    override fun buildStandard(): MudHouseDoc {
        return this.addRooms(1).addDoors(1).build();
    }
}

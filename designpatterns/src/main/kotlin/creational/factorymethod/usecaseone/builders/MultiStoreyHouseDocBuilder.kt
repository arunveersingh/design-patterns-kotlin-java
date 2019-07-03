package creational.factorymethod.usecaseone.builders

import creational.factorymethod.usecaseone.docs.MultiStoreyHouseDoc

class MultiStoreyHouseDocBuilder :
    Builder<MultiStoreyHouseDocBuilder, MultiStoreyHouseDoc> {

    private val details: MultiStoreyHouseDoc =
        MultiStoreyHouseDoc()

    override fun addWindows(number: Int): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality wood windows /n")
        return this
    }

    override fun addDoors(number: Int): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality wood doors /n")
        return this
    }

    override fun addRooms(number: Int): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality italian finished rooms /n")
        return this
    }

    override fun addGarage(): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality multi vehicle garage /n")
        return this
    }

    override fun addSwimmingPool(): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality swimming pool /n")
        return this
    }

    override fun addHelipad(): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality helipad /n")
        return this
    }

    override fun addGarden(): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality colorful garden /n")
        return this
    }

    override fun addPartyHall(): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality party hall with very good disco lights /n")
        return this
    }

    override fun addAmphiTheater(): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality wood finished amphitheater /n")
        return this
    }

    override fun addTennisCourt(): MultiStoreyHouseDocBuilder {
        details.addToDoc("This house has multistorey quality wooden tennis court /n")
        return this
    }

    override fun build(): MultiStoreyHouseDoc = details
}

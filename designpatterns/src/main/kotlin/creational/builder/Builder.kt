package creational.builder

/**
 * @param BT Builder Type
 * @param CT Object to be created.
 */
interface Builder<BT, CT> {

    fun addWindows(number: Int) : BT
    fun addDoors(number: Int) : BT
    fun addRooms(number: Int) : BT
    fun addGarage() : BT
    fun addSwimmingPool() : BT
    fun addHelipad() : BT
    fun addGarden(): BT
    fun addPartyHall() : BT
    fun addAmphiTheater(): BT
    fun addTennisCourt() : BT

    fun build() : CT
}
package creational.builder

interface Builder<T> {
    fun addWindows(number: Number) : T
    fun addDoors(number: Number) : T
    fun addRooms(number: Number) : T
    fun addGarage() : T
    fun addSwimmingPool() : T
    fun addHelipad() : T
    fun addGarden(): T
    fun addPartyHall() : T
    fun addAmphiTheater(): T
    fun addTennisCourt() : T
}
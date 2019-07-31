package behavioral.memento

interface Memento {
    fun set10(value: Options): Memento
    fun set11(value: Options): Memento
    fun set12(value: Options): Memento

    fun set20(value: Options): Memento
    fun set21(value: Options): Memento
    fun set22(value: Options): Memento

    fun set30(value: Options): Memento
    fun set31(value: Options): Memento
    fun set32(value: Options): Memento

    fun get10(): Options
    fun get11(): Options
    fun get12(): Options
    fun get20(): Options
    fun get21(): Options
    fun get22(): Options
    fun get30(): Options
    fun get31(): Options
    fun get32(): Options
}
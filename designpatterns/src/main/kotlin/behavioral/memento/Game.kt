package behavioral.memento

import java.util.*

/**
 * Idea is to showcase how pattern works (of course just one of the way)
 * so not handling any of the corner exception use cases.
 * Fell free to do you modifications make it behave the way you want.
 */
class Game {

    private val stack: Stack<Memento> = Stack()

    var p10 = Options.BLANK
    var p11 = Options.BLANK
    var p12 = Options.BLANK
    var p20 = Options.BLANK
    var p21 = Options.BLANK
    var p22 = Options.BLANK
    var p30 = Options.BLANK
    var p31 = Options.BLANK
    var p32 = Options.BLANK

    fun saveState(): Unit {
        stack.push(
            GameMemento().set10(p10).set11(p11).set12(p12).set20(p20).set21(p21).set22(p22).set30(p30).set31(p31).set32(
                p32
            )
        )
    }

    fun undo() {
        val memento = stack.pop()
        this.p10 = memento.get10()
        this.p11 = memento.get11()
        this.p12 = memento.get12()
        this.p20 = memento.get20()
        this.p21 = memento.get21()
        this.p22 = memento.get22()
        this.p30 = memento.get30()
        this.p31 = memento.get31()
        this.p32 = memento.get32()
    }

    private class GameMemento : Memento {
        private var p10 = Options.BLANK
        private var p11 = Options.BLANK
        private var p12 = Options.BLANK
        private var p20 = Options.BLANK
        private var p21 = Options.BLANK
        private var p22 = Options.BLANK
        private var p30 = Options.BLANK
        private var p31 = Options.BLANK
        private var p32 = Options.BLANK

        override fun set10(value: Options): Memento {
            this.p10 = value
            return this
        }

        override fun set11(value: Options): Memento {
            this.p11 = value
            return this
        }

        override fun set12(value: Options): Memento {
            this.p12 = value
            return this
        }

        override fun set20(value: Options): Memento {
            this.p20 = value
            return this
        }

        override fun set21(value: Options): Memento {
            this.p21 = value
            return this
        }

        override fun set22(value: Options): Memento {
            this.p22 = value
            return this
        }

        override fun set30(value: Options): Memento {
            this.p30 = value
            return this
        }

        override fun set31(value: Options): Memento {
            this.p31 = value
            return this
        }

        override fun set32(value: Options): Memento {
            this.p32 = value
            return this
        }

        override fun get10(): Options = this.p10
        override fun get11() = this.p11
        override fun get12() = this.p12
        override fun get20() = this.p20
        override fun get21() = this.p21
        override fun get22() = this.p22
        override fun get30() = this.p30
        override fun get31() = this.p31
        override fun get32() = this.p32


        override fun toString(): String {
            return "GameMemento(p10=$p10, p11=$p11, p12=$p12, p20=$p20, p21=$p21, p22=$p22, p30=$p30, p31=$p31, p32=$p32)"
        }


    }

    override fun toString(): String {
        return "Game(p10=$p10, p11=$p11, p12=$p12, p20=$p20, p21=$p21, p22=$p22, p30=$p30, p31=$p31, p32=$p32)"
    }


}
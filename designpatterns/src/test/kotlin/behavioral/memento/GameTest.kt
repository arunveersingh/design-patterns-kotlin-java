package behavioral.memento

import org.junit.Assert
import org.junit.Test

class GameTest {

    @Test
    fun testGame(){

        var game : Game = Game()
        // move 1
        game.p10 = Options.CROSS
        game.saveState()

        println(game)
        Assert.assertEquals(game.toString(), "Game(p10=CROSS, p11=BLANK, p12=BLANK, p20=BLANK, p21=BLANK, p22=BLANK, p30=BLANK, p31=BLANK, p32=BLANK)")
        // move 2
        game.p11 = Options.CIRCLE
        game.saveState()
        Assert.assertEquals(game.toString(), "Game(p10=CROSS, p11=CIRCLE, p12=BLANK, p20=BLANK, p21=BLANK, p22=BLANK, p30=BLANK, p31=BLANK, p32=BLANK)")

        // move 3
        game.p21 = Options.CROSS
        println(game)
        Assert.assertEquals(game.toString(), "Game(p10=CROSS, p11=CIRCLE, p12=BLANK, p20=BLANK, p21=CROSS, p22=BLANK, p30=BLANK, p31=BLANK, p32=BLANK)")

        // undo move 3
        game.undo()
        Assert.assertEquals(game.toString(), "Game(p10=CROSS, p11=CIRCLE, p12=BLANK, p20=BLANK, p21=BLANK, p22=BLANK, p30=BLANK, p31=BLANK, p32=BLANK)")

        // undo move 2
        game.undo()
        Assert.assertEquals(game.toString(), "Game(p10=CROSS, p11=BLANK, p12=BLANK, p20=BLANK, p21=BLANK, p22=BLANK, p30=BLANK, p31=BLANK, p32=BLANK)")




    }
}
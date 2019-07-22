package behavioral.iterator

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class IteratorTest {

    var dashBoard: DashBoard = DashBoard()
    var topic1: Topic = Topic("topic1", "abc")
    var topic2: Topic = Topic("topic2", "def")
    var topic3: Topic = Topic("topic3", "ghi")

    @Before
    fun setup() {
        dashBoard.initTopics(arrayOf(topic1, topic2, topic3))
    }

    @Test
    fun testTopicIterator() {

        var itr: MyIterator<Topic> = dashBoard.getIterator()

        val received = mutableListOf<Topic>()
        while (itr.hasNext()) {
            received.add(itr.next())
        }

        assert(received.size == 3)
        assert(received[0] == topic1)
        assert(received[1] == topic2)
        assert(received[2] == topic3)

        println("--- assertions without Coroutine are successful ---")

        GlobalScope.launch {

            var itr: MyIterator<Topic> = dashBoard.getIterator()

            val received = mutableListOf<Topic>()
            while (itr.hasNext()) {
                var t: Topic = itr.next();
                received.add(t)
                println("coroutine one : item iterated: $t ")
            }

            assert(received.size == 3)
            assert(received[0] == topic1)
            assert(received[1] == topic2)
            assert(received[2] == topic3)

            return@launch println("--- assertions without Coroutine 1 are successful ---")

        }


        GlobalScope.launch {

            var itr: MyIterator<Topic> = dashBoard.getIterator()

            val received = mutableListOf<Topic>()
            while (itr.hasNext()) {
                var t: Topic = itr.next();
                received.add(t)
                println("coroutine two : item iterated: $t ")
            }

            assert(received.size == 3)
            assert(received[0] == topic1)
            assert(received[1] == topic2)
            assert(received[2] == topic3)

            return@launch println("--- assertions without Coroutine 2 are successful ---")

        }
        runBlocking { 2300 }
    }

    /**
     * one of the sample output of coroutines part
     *

    --- assertions without Coroutine are successful ---
    coroutine one : item iterated: Topic(name=topic1)
    coroutine one : item iterated: Topic(name=topic2)
    coroutine two : item iterated: Topic(name=topic1)
    coroutine two : item iterated: Topic(name=topic2)
    coroutine two : item iterated: Topic(name=topic3)
    --- assertions without Coroutine 2 are successful ---
    coroutine one : item iterated: Topic(name=topic3)
    --- assertions without Coroutine 1 are successful ---

     */
}
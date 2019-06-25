package behavioral.iterator

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import kotlin.coroutines.coroutineContext

class IteratorTest {

    var dashBoard: DashBoard = DashBoard()
    var topic1: Topic = Topic("topic1")
    var topic2: Topic = Topic("topic2")
    var topic3: Topic = Topic("topic3")

    @Before
    fun setup() {
        dashBoard.initTopics(arrayOf(topic1, topic2, topic3))
    }

    @Test
    fun testTopicIterator() {

        var itr: CustomIterator<Topic> = dashBoard.getTopicIterator()

        val received = mutableListOf<Topic>()
        while (itr.hasNext()) {
            received.add(itr.next())
        }

        println("--- Completed basic one ---")

        assert(received.size == 3)
        assert(received[0] == topic1)
        assert(received[1] == topic2)
        assert(received[2] == topic3)


        GlobalScope.launch {

            var itr: CustomIterator<Topic> = dashBoard.getTopicIterator()

            val received = mutableListOf<Topic>()
            while (itr.hasNext()) {
                var t: Topic = itr.next();
                received.add(t)
                println("coroutine one --- ")
            }

            println("--- Completed basic two ---")

        }

        GlobalScope.launch {

            var itr: CustomIterator<Topic> = dashBoard.getTopicIterator()

            val received = mutableListOf<Topic>()
            while (itr.hasNext()) {
                var t: Topic = itr.next();
                received.add(t)
                println("coroutine two --- ")
            }

            println("--- Completed basic three ---")

        }

        println("--- Completed  ---")


    }
}
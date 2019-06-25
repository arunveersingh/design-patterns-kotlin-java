package behavioral.iterator

class TopicIterator(private val topics: Array<Topic>) : CustomIterator<Topic> {

    var currentPosition: Int = 0

    override fun next(): Topic{
        currentPosition ++;
        return topics[currentPosition -1]
    }

    override fun hasNext(): Boolean = currentPosition < topics.size
}
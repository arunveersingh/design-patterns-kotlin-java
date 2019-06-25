package behavioral.iterator

/**
 * Aggregator
 *
 * This class aggregates the Topic in an Array.
 * DashBoard#getTopicIterator returns an objects which
 * helps in iterating the elements aggregated.
 *
 * Important thing to observe here is that Iteration logic is completely
 * in the TopicIterator. So even without having access to topics and without
 * knowing the underlying storage data structure we are able to iterate the elements.
 *
 */
class DashBoard {

    private var topics: Array<Topic> = emptyArray()

    // Just a bad way to initialize it... but still doing at is
    // intent is just to have an array which is initialized with some values
    fun initTopics(topics: Array<Topic>){
        this.topics = topics
    }

    fun getTopicIterator() : TopicIterator = TopicIterator(topics)
}
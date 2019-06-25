package behavioral.iterator

class DashBoard {
    private var topics: Array<Topic> = emptyArray()

    fun getTopics() : Array<Topic> = topics

    // Just a bad way to initialize it... but still doing at is
    // intent is just to have an array which is initialized with some values
    fun initTopics(topics: Array<Topic>){
        this.topics = topics
    }

    fun getTopicIterator() : TopicIterator = TopicIterator(getTopics())
}
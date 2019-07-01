package behavioral.iterator

class MyIteratorImpl<T>(private val topics: Array<T>) : MyIterator<T> {

    var currentPosition: Int = 0

    override fun next(): T {
        currentPosition ++
        return topics[currentPosition -1]
    }

    override fun hasNext(): Boolean = currentPosition < topics.size
}
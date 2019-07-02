package behavioral.iterator

class MyIteratorImpl<T>(private val elements: Array<T>) : MyIterator<T> {

    private var currentPosition: Int = 0

    override fun next(): T {
        currentPosition ++
        return elements[currentPosition -1]
    }

    override fun hasNext(): Boolean = currentPosition < elements.size
}
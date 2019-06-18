package behavioral.iterator

interface MyIterator<T> {
    fun hasNext() : Boolean
    fun next() : T
    fun remove() {
        throw UnsupportedOperationException("remove")
    }
}
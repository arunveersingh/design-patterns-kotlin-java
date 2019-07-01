package behavioral.iterator

interface SupportsIterator<T> {

    fun getIterator() :MyIterator<T>
}
package behavioral.iterator

interface CustomIterator<T> {

    fun next(): T

    fun hasNext(): Boolean

}
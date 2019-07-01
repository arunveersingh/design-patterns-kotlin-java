package behavioral.iterator


interface MyIterator<T> {

    fun next(): T

    fun hasNext(): Boolean

}
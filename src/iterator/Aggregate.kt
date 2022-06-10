package iterator

interface Aggregate<T> {
    fun createIterator() : Iterator<T>
}
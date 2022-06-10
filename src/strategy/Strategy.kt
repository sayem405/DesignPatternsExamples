package strategy

interface SortStrategy<T> {
    fun sort(list : MutableList<T>)
}

class QuickSort: SortStrategy<String> {
    override fun sort(list: MutableList<String>) {
        println("sorting with quick sort algorithm")
        return list.sort()
    }
}



class MergeSort: SortStrategy<String> {
    override fun sort(list: MutableList<String>)  {
        println("sorting with merge sort algorithm")
        list.sort()
    }
}
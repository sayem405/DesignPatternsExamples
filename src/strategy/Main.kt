package strategy

fun main() {
    val sortStrategy = QuickSort()
    val sortedList = SortedList(sortStrategy)

    sortedList.add("sayem")
    sortedList.add("arman")

    sortedList.sort()
    sortedList.printList()

    // update with new sort strategy
    sortedList.sortStrategy = MergeSort()

    sortedList.add("mahi")

    sortedList.sort()
    sortedList.printList()
}
package strategy

class SortedList(var sortStrategy: SortStrategy<String>) {
    private val list = ArrayList<String>()

    fun add(value: String) {
        list.add(value)
    }

    fun sort() {
        sortStrategy.sort(list)
    }

    fun printList() {
        list.forEach { value ->
            println("$value")
        }
    }
}
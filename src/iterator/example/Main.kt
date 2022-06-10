package iterator.example

fun main() {
    val notificationCollection = NotificationCollection()
    notificationCollection.add(Notification("sayem"))
    notificationCollection.add(Notification("arman"))

    val iterator = notificationCollection.createIterator()
    while(iterator.hasNext()) {
        iterator.next().also {
            println(it.title)
        }
    }
}
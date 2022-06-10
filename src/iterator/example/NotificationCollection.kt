package iterator.example

import iterator.Aggregate

class NotificationCollection : Aggregate<Notification> {

    private val list = ArrayList<Notification>()

    fun add(notification: Notification) {
        list.add(notification)
    }

    override fun createIterator(): iterator.Iterator<Notification> {
        return NotificationIterator(list)
    }
}
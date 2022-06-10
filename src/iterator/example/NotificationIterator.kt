package iterator.example

class NotificationIterator (var notificationList : ArrayList<Notification>): iterator.Iterator<Notification> {
    private var currentPosition : Int = 0
    override fun hasNext(): Boolean {
        return currentPosition < notificationList.size
    }

    override fun next(): Notification {
        return notificationList[currentPosition].also {
            currentPosition++
        }
    }
}
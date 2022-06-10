package observer

import jdk.incubator.foreign.ValueLayout.OfBoolean

interface Observer {
    fun update(stock: Stock)
}

open class Investor(private val name : String) : Observer {
    override fun update(stock: Stock) {
        println("notified $name , price : ${stock.price}")
    }

}

interface Stock {
    var price : Int
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notifyToAll()
}


class IBM : Stock {
    override var price: Int = 0
        set(value) {
            if (value != field) {
                field = value
                notifyToAll()
            }
        }
    private val observerList = ArrayList<Observer>()
    override fun attach(observer: Observer) {
        observerList.add(observer)
    }

    override fun detach(observer: Observer) {
        observerList.remove(observer)
    }

    override fun notifyToAll() {
        observerList.forEach {
            it.update(this)
        }
    }
}
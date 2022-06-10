package builder

interface IHouseBuilder {
    fun build(): House
}

class HouseBuilder : IHouseBuilder {
    private var basement: Basement? = null
    private var roof: Roof? = null
    private var windowCount : Int = 0

    fun setBasement(): HouseBuilder {
        this.basement = Basement()
        return this
    }

    fun totalWindow(count : Int) : HouseBuilder {
        this.windowCount = count
        return this
    }

    fun setRoof(): HouseBuilder {
        this.roof = Roof()
        return this
    }

    override fun build(): House {
        val windows : ArrayList<Window> = ArrayList()
        for (i in 1.. windowCount) {
            windows.add(Window())
        }
        return House(roof = roof, basement = basement, windows = windows)
    }
}
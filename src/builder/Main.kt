package builder

fun main() {
    val builder: IHouseBuilder = HouseBuilder().setBasement().totalWindow(3).setRoof()
    val house = builder.build()
    println(house)
}
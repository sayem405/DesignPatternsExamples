package builder

interface Product

class Door
class Roof
class Window
class Garage
class Basement

data class House(
        val basement: Basement? = null,
        val roof: Roof? = null,
        val windows: List<Window>? = null,
        val doors: List<Door>? = null,
        val garage: Garage? = null
)
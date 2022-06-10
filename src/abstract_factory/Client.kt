package abstract_factory

class AnimalWorld(private val laptopComponentFactory: LaptopComponentFactory) {
    fun run() {
        laptopComponentFactory.createRam()
    }
}
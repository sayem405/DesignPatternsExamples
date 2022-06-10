package abstract_factory

fun main() {
    val appleFactory = AppleComponentFactory()
    val animalWorld = AnimalWorld(appleFactory)
    animalWorld.run()
}
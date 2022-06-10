package abstract_factory

interface LaptopComponentFactory {
    fun createProcessor() : Processor
    fun createRam() : Ram
}


class AppleComponentFactory : LaptopComponentFactory {
    override fun createProcessor(): Processor {
        return M1Processor()
    }

    override fun createRam(): Ram {
        return TranscendRam()
    }

}

class SamsungFactory : LaptopComponentFactory {
    override fun createProcessor(): Processor {
        return IntelProcessor()
    }

    override fun createRam(): Ram {
        return SamsungRam()
    }
}
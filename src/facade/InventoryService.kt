package facade

interface InventoryService {
    fun isAvailable(product: Product) : Boolean
}

class InventoryServiceImpl() : InventoryService {
    override fun isAvailable(product: Product): Boolean {
        println("product available")
        return true
    }
}
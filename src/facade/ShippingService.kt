package facade

interface ShippingService {
    fun ship(product: Product)
}

class ShippingServiceImpl() : ShippingService{
    override fun ship(product: Product) {
        println("product ${product.name} shipped")
    }
}
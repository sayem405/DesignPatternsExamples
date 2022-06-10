package facade

interface OrderServiceFacade {
    fun placeOrder(product: Product) : Boolean
}

class OrderServiceFacadeImpl(
        private val inventoryService: InventoryService,
        private val paymentService: PaymentService,
        private val shippingService: ShippingService
) : OrderServiceFacade {
    override fun placeOrder(product: Product) : Boolean {
        if (inventoryService.isAvailable(product)) {
            val paymentConfirmed = paymentService.makePayment()
            if (paymentConfirmed) {
                shippingService.ship(product)
                return true
            }
        }
        return false
    }

}
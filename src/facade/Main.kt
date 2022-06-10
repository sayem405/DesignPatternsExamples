package facade

fun main() {
    val orderServiceFacade = OrderServiceFacadeImpl(
            InventoryServiceImpl(),
            PaymentServiceImpl(),
            ShippingServiceImpl()
    )
    orderServiceFacade.placeOrder(Product("1", "laptop"))
}
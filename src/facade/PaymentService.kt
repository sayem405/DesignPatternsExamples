package facade

interface PaymentService {
    fun makePayment() : Boolean
}

class PaymentServiceImpl : PaymentService {
    override fun makePayment(): Boolean {
        println("payment confirmed")
        return true
    }
}
package adapter

// Adapter for PaypalGateway - implements the target interface
class PaypalAdapter(val paypalGateway: PaypalGateway): PaymentService {

    override fun pay(amount: Int, customerId: Int): String {
        val result = paypalGateway.doTransaction(amount.toDouble(), customerId)
        return if (result == 1) "Success" else "Failed"
    }
}
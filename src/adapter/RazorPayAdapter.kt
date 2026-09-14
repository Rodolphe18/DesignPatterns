package adapter

// Adapter for RazorpayGateway - implements the target interface
class RazorPayAdapter(private val razorPayGateway: RazorPayGateway): PaymentService {

    override fun pay(amount: Int, customerId: Int): String {
        val result = razorPayGateway.performTransaction(amount.toDouble(), customerId.toDouble())
        return if (result) { "Success" } else "Failed"
    }


}
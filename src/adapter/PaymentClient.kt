package adapter

// The client is implemented against the target interface
class PaymentClient(private val paymentService: PaymentService) {

    fun makePayment() {

        val result = paymentService.pay(100, 123)

        if (result == "Success") {
            print("Payment Successful")
        } else {
            print("Payment Failed")
        }
    }
}
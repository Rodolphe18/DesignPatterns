package adapter

// target interface
interface PaymentService {

    fun pay(amount:Int, customerId:Int):String

}
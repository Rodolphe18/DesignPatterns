import adapter.PaymentClient
import adapter.PaypalAdapter
import adapter.PaypalGateway
import observer.CurrentConditionsDisplay
import observer.WeatherStation
import strategy.Push
import strategy.compress.GzipCompression
import strategy.encrypt.AESEncryption

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Observer Pattern
//    val subject = WeatherStation(temperature = 1.0f, humidity = 1.0f)
//    val observer1 = CurrentConditionsDisplay.createAndSubscribe(subject)
//    val observer2 = CurrentConditionsDisplay.createAndSubscribe(subject)
//
//    subject.setMeasurements(20f, 45f)
//
//    observer1.display()
//    observer2.display()

    // Adapter Pattern
//    val paypalAdapter = PaypalAdapter(PaypalGateway())
//    val payment = PaymentClient(paypalAdapter)
//    payment.makePayment()

    // Strategy Pattern
    val push  = Push(AESEncryption(), GzipCompression())
    push.send()
    push.compress()



}
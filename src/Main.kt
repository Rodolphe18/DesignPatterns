import proxy.protection_proxy.DatabaseProxy
import proxy.protection_proxy.MySqlDatabase
import proxy.remote_proxy.local.WeatherProxy
import proxy.remote_proxy.remote.WeatherService

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
//    val push  = Push(AESEncryption(), GzipCompression())
//    push.send()
//    push.compress()


    // Virtual  Proxy Pattern
//    val video1 = ProxyMovie("Groki.mp4")
//    val video2 = ProxyMovie("Molne.txt")
//    val video3 = ProxyMovie("Juine.txt")
//    val video4 = ProxyMovie("Hertio.txt")
   // video1.play()
  //  video1.play()

    // Protection proxy
  //  val db = DatabaseProxy(MySqlDatabase(), "ADLEMIN")
  //  db.delete()

    // Remote Proxy
    val service = WeatherProxy(WeatherService())
    service.getWeather()



}
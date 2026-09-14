import decorator.CheeseDecorator
import decorator.MargheritaPizza
import decorator.MushroomDecorator
import decorator.Pizza
import prototype.GameBotCharacter
import prototype.Testing
import proxy.protection_proxy.DatabaseProxy
import proxy.protection_proxy.MySqlDatabase
import proxy.remote_proxy.local.WeatherProxy
import proxy.remote_proxy.remote.WeatherService
import sun.awt.Mutex

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
   // val service = WeatherProxy(WeatherService())
   // service.getWeather()

    // Decorator pattern
//    var pizza = MargheritaPizza() as Pizza
//    println(pizza.getDescription() + " " + pizza.getCost())
//
//    pizza = CheeseDecorator(pizza)
//    println(pizza.getDescription() + " " + pizza.getCost())
//
//    pizza = MushroomDecorator(pizza)
//    println(pizza.getDescription() + " " + pizza.getCost())

    val gameBotCharacter1 = GameBotCharacter.createBotCharacter("Game Bot1", 100, 0, mutableListOf("Rifle"))
    val gameBotCharacter2 = gameBotCharacter1.clone()
    val gameBotCharacter3 = gameBotCharacter1.clone()
    val gameBotCharacter4 = gameBotCharacter1.clone()
    val weapons = gameBotCharacter4.weapons
    weapons.add("Kalachnikov")

    println(gameBotCharacter1)
    println(gameBotCharacter2)
    println(gameBotCharacter3)
    println(gameBotCharacter4)



}
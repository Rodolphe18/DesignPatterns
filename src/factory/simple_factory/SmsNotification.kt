package factory.simple_factory

class SmsNotification: Notification {

   override fun send() {
        println("SMS Notification")
    }

}
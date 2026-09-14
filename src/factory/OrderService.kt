package factory

import factory.factory_method_pattern.SmsFactory
import factory.simple_factory.NotificationFactory

class OrderService {

    fun sendNotification() {

        // Simple Factory pattern
        val notification1 = NotificationFactory.createNotification("SMS")
        notification1.send()

        // Factory Method Pattern
        val factory = SmsFactory()
        val notification2 = factory.createNotification()
        notification2.send()


    }

}
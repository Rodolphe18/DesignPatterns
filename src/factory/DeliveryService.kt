package factory

import factory.simple_factory.NotificationFactory

class DeliveryService {

    fun sendNotification() {
        val notifications = NotificationFactory.createNotifications(listOf("EMAIL", "D"))
        for (notification in notifications) {
            notification.send()
        }
    }

}
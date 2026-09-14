package factory.simple_factory

class NotificationFactory() {


    companion object {
        fun createNotification(type: String): Notification {
            if (type == "EMAIL") {
                return EmailNotification()
            } else if (type == "SMS") {
                return SmsNotification()
            }
            throw IllegalStateException()
        }

        fun createNotifications(types: List<String>): List<Notification> {
            val list = mutableListOf<Notification>()

            for (type in types) {
                list.add(createNotification(type))
            }
            return list.toList()
        }

    }



}
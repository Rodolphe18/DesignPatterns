package factory.simple_factory

class EmailNotification: Notification {

   override fun send()  {
        print("Email Notification")
    }
}
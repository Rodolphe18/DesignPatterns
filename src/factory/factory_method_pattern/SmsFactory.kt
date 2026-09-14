package factory.factory_method_pattern

import factory.abstract_factory.SmsTemplate
import factory.abstract_factory.Template
import factory.simple_factory.Notification
import factory.simple_factory.SmsNotification

class SmsFactory: NotificationFactoryMethod {
    override fun createNotification(): Notification {
        return SmsNotification()
    }

    override fun createTemplate(): Template {
        return SmsTemplate()
    }
}
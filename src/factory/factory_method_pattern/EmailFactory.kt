package factory.factory_method_pattern

import factory.abstract_factory.EmailTemplate
import factory.abstract_factory.Template
import factory.simple_factory.EmailNotification
import factory.simple_factory.Notification

class EmailFactory : NotificationFactoryMethod {
    override fun createNotification(): Notification {
        return EmailNotification()
    }

    override fun createTemplate(): Template {
        return EmailTemplate()
    }
}
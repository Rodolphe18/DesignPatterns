package factory.factory_method_pattern

import factory.abstract_factory.Template
import factory.simple_factory.Notification

interface NotificationFactoryMethod {
    fun createNotification(): Notification
    fun createTemplate(): Template
}
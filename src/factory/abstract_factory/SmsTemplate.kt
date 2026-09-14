package factory.abstract_factory

class SmsTemplate: Template {
    override fun format() {
        print("SMS Template")
    }
}
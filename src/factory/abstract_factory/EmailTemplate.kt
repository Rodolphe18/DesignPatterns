package factory.abstract_factory

class EmailTemplate: Template {
    override fun format() {
        print("Email Template")
    }
}
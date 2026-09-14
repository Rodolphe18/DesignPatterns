package decorator

class MargheritaPizza: Pizza {
    override fun getDescription(): String {
        return "Margherita pizza"
    }

    override fun getCost(): Int {
        return 5
    }
}
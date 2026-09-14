package decorator

class CheeseDecorator(private val pizza: Pizza): PizzaDecorator(pizza) {

    override fun getDescription(): String {
        return pizza.getDescription() + ": cheese"
    }

    override fun getCost(): Int {
        return pizza.getCost() + 1
    }
}
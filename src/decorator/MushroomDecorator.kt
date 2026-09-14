package decorator

class MushroomDecorator(private val pizza: Pizza): PizzaDecorator(pizza) {
    override fun getDescription(): String {
        return pizza.getDescription() + ": mushroom "
    }

    override fun getCost(): Int {
        return pizza.getCost() + 1
    }
}
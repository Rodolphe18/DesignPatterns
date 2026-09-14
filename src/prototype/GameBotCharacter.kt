package prototype

class GameBotCharacter private constructor(
    private val name: String,
    private val health: Int,
    private val attackPower: Int,
    weapons: List<String>
) : Cloneable<GameBotCharacter> {

    val weapons: MutableList<String> = weapons.toMutableList()

    private constructor(other: GameBotCharacter) : this(
        name = other.name,
        health = other.health,
        attackPower = other.attackPower,
        weapons = other.weapons
    )

    fun copy(
        name: String = this.name,
        health: Int = this.health,
        attackPower: Int = this.attackPower,
        weapons: List<String> = this.weapons
    ): GameBotCharacter {
        return GameBotCharacter(name, health, attackPower, weapons)
    }


    override fun clone(): GameBotCharacter {
        return GameBotCharacter(this)
    }

    override fun toString(): String {
        return "$name - $health - $attackPower - $weapons"
    }


    companion object {

        fun createBotCharacter(name: String, health: Int, attackPower: Int, weapons: List<String>): GameBotCharacter {
            println("loading a bot character")
            Thread.sleep(1000)
            println("loading sound effects")
            Thread.sleep(1000)
            val gameBotCharacter = GameBotCharacter(name, health, attackPower, weapons)
            return gameBotCharacter
        }

    }

}
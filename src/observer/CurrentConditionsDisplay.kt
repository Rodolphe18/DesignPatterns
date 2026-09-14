package observer

class CurrentConditionsDisplay private constructor(): Observer {

    var temperature: Float = 0f
        private set

    var humidity: Float = 0f
        private set

    override fun update(temperature: Float, humidity: Float) {
        this.temperature = temperature
        this.humidity = humidity
    }

    fun display() {
        println("$temperature")
        println("$humidity")
    }

    companion object {

        fun createAndSubscribe(subject: Subject): CurrentConditionsDisplay {
            val display = CurrentConditionsDisplay()
            subject.subscribe(display)
            return display
        }
    }

}
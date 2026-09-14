package observer

class WeatherStation(private var temperature:Float, private var humidity:Float): Subject {

    // liste des observateurs
    private val observers = mutableSetOf<Observer>()

    override fun subscribe(observer: Observer) {
        if (observers.add(observer)) {
            observer.update(temperature, humidity)
        }
    }

    override fun unsubscribe(observer: Observer) {
        observers.remove(observer)
    }

    // méthode pour notifier les observateurs d'un changement
    private fun notifyObservers() {
        observers.toList().forEach { observer->
            observer.update(temperature, humidity)
        }
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature:Float, humidity: Float) {
        this.temperature = temperature
        this.humidity = humidity
        measurementsChanged()
    }



}
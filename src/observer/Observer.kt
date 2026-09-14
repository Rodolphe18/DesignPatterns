package observer

interface Observer {
   fun update(temperature: Float, humidity: Float)
}
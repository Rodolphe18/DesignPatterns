package proxy.remote_proxy.local

import proxy.remote_proxy.remote.Weather

class WeatherProxy(private val weather: Weather) : Weather {

    override fun getWeather(): String {
        authenticate()
        openConnection()
        serializeRequest()
        return sendHttpRequest()
    }

    private fun authenticate() {
        println("Authenticating")
    }

    private fun openConnection() {
        println("Open Connection")
    }

    private fun serializeRequest() {
        println("SerializeRequest")
    }

    private fun sendHttpRequest(): String {
        println("Send HTTP request")
        return weather.getWeather()
    }
}
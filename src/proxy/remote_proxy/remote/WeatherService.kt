package proxy.remote_proxy.remote

class WeatherService: Weather {
    override fun getWeather(): String {
        println("Fetching weather data...")
        return "35 degree celsius"
    }
}
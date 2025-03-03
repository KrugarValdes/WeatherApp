package band.effective.practice.domain.model

data class Weather(
    val location: Location,
    val current: Current,
    val forecast: Forecast? = null
)

data class Location(
    val name: String,
    val localtime: String
)

data class DayForecast(
    val date: String,
    val maxTemp: Double,
    val minTemp: Double,
    val condition: Condition,
    val sunrise: String,
    val sunset: String
)

data class Astro(
    val sunrise: String,
    val sunset: String,
    val moonrise: String,
    val moonset: String
)

data class Current(
    val tempC: Double,
    val feelslikeC: Double,
    val condition: Condition,
    val windKph: Double,
    val windDir: String,
    val pressureMb: Double,
    val humidity: Int,
    val uv: Double,
    val lastUpdated: String
)

data class Condition(
    val text: String,
    val icon: String,
    val code: Int
)

data class Forecast(
    val forecastDays: List<ForecastDay>
)

data class ForecastDay(
    val date: String,
    val day: DayData,
    val astro: Astro,
    val hours: List<Hour>
)

data class DayData(
    val maxTempC: Double,
    val minTempC: Double,
    val condition: Condition
)

data class Hour(
    val time: String,
    val tempC: Double,
    val condition: Condition,
    val chanceOfRain: Int
)
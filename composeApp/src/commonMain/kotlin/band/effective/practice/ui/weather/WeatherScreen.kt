package band.effective.practice.ui.weather

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.unit.dp
import band.effective.practice.domain.model.Astro
import band.effective.practice.domain.model.Current
import band.effective.practice.domain.model.ForecastDay
import band.effective.practice.domain.model.Hour
import band.effective.practice.domain.model.Location
import band.effective.practice.domain.model.Weather
import org.jetbrains.compose.resources.Font


/*
@Composable
fun WeatherScreen(weather: Weather) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        CurrentWeatherSection(weather.location, weather.current)
        HourlyForecastSection(hours = emptyList())
        WeeklyForecastSection(days = emptyList())
        WeatherDetailsSection(current = weather.current)
        AstroSection(astro = Astro("", "", "", ""))
    }
}

@Composable
private fun CurrentWeatherSection(location: Location, current: Current) {
    Column {
        Text(
            text = location.name,
            style = MaterialTheme.typography.headlineLarge,
            color = Color.Black
        )

        Text(
            text = "Thu, 18 February", // Заглушка для даты
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "21°",
                style = MaterialTheme.typography.displayLarge,
                color = Color.Black
            )

            AsyncImage(
                model = "https://example.com/icon.png",
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
        }

        Text(
            text = "Sunny",
            style = MaterialTheme.typography.titleLarge
        )

        Text(
            text = "Feels like 19°",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
    }
}

@Composable
private fun HourlyForecastSection(hours: List<Hour>) {
    Column {
        Text(
            text = "Hourly Forecast",
            style = MaterialTheme.typography.titleLarge
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(5) { // Заглушка для 5 элементов
                HourlyForecastItem()
            }
        }
    }
}

@Composable
private fun HourlyForecastItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "12:00",
            style = MaterialTheme.typography.bodyMedium
        )
        AsyncImage(
            model = "https://example.com/icon.png",
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = "20°",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
private fun WeeklyForecastSection(days: List<ForecastDay>) {
    Column {
        Text(
            text = "7-Day Forecast",
            style = MaterialTheme.typography.titleLarge
        )

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            repeat(7) { // Заглушка для 7 дней
                DailyForecastItem()
            }
        }
    }
}

@Composable
private fun DailyForecastItem() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Mon",
            style = MaterialTheme.typography.bodyMedium
        )

        AsyncImage(
            model = "https://example.com/icon.png",
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )

        Text(
            text = "22° / 18°",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
private fun WeatherDetailsSection(current: Current) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            text = "Weather Details",
            style = MaterialTheme.typography.titleLarge
        )

        // Заглушка для сетки деталей
        Column {
            Text("Humidity: 65%")
            Text("Wind Speed: 15 km/h")
            Text("Pressure: 1013 hPa")
            Text("UV Index: 3")
        }
    }
}

@Composable
private fun AstroSection(astro: Astro) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            text = "Sun & Moon",
            style = MaterialTheme.typography.titleLarge
        )

        // Заглушка для астрономических данных
        Column {
            Text("Sunrise: 6:00 AM")
            Text("Sunset: 6:00 PM")
            Text("Moonrise: 7:00 PM")
            Text("Moonset: 5:00 AM")
        }
    }
}*/
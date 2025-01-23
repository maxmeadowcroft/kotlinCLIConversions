package main.kotlin.com.conversions.temperature

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * (5/9)
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * (9/5)) + 32
}

fun celsiusToKelvin(celsius: Double): Double {
    return celsius + 273.15
}

fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return ((fahrenheit - 32) * (5/9)) + 273.15
}

fun kelvinToFahrenheit(kelvin: Double): Double {
    return ((kelvin - 273) * (9/5)) + 32
}
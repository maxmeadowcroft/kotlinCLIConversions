package main.kotlin.com.conversions.speed

fun milesPerHourToKiloMetersPerHour(mph: Double): Double {
    return mph * 1.60934
}

fun kilometersPerHourToMilesPerHour(kph: Double): Double {
    return kph * 0.621371
}
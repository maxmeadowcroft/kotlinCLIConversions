package main.kotlin.com.conversions.time

fun secondsToMinutes(seconds: Double): Double {
    return seconds / 60
}

fun minutesToSeconds(minutes: Double): Double {
    return minutes * 60
}

fun minutesToHours(minutes: Double): Double {
    return minutes / 60
}

fun hoursToMinutes(hours: Double): Double {
    return hours * 60
}

fun secondsToHours(seconds: Double): Double {
    return seconds / (60 * 60)
}

fun hoursToSeconds(hours: Double): Double {
    return hours * (60 * 60)
}
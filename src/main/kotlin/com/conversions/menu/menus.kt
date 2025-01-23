package main.kotlin.com.conversions.menu

import main.kotlin.com.conversions.temperature.*
import main.kotlin.com.conversions.distance.*
import main.kotlin.com.conversions.weight.*
import main.kotlin.com.conversions.speed.*
import main.kotlin.com.conversions.base.*
import main.kotlin.com.conversions.operations.*
import main.kotlin.com.conversions.time.*

// --------------------- Temperature Menu ---------------------
fun runTemperatureMenu() {
    while (true) {
        println("\n=== TEMPERATURE CONVERSIONS ===")
        println("1) Celsius to Fahrenheit")
        println("2) Fahrenheit to Celsius")
        println("3) Celsius to Kelvin")
        println("4) Kelvin to Celsius")
        println("5) Fahrenheit to Kelvin")
        println("6) Kelvin to Fahrenheit")
        println("b) Back to Main Menu")

        print("Choose an option: ")
        when (readln().trim().lowercase()) {
            "1" -> {
                print("Enter Celsius: ")
                val c = readln().toDoubleOrNull()
                if (c != null) {
                    val f = celsiusToFahrenheit(c)
                    println("$c °C = $f °F\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "2" -> {
                print("Enter Fahrenheit: ")
                val f = readln().toDoubleOrNull()
                if (f != null) {
                    val c = fahrenheitToCelsius(f)
                    println("$f °F = $c °C\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "3" -> {
                print("Enter Celsius: ")
                val c = readln().toDoubleOrNull()
                if (c != null) {
                    val k = celsiusToKelvin(c)
                    println("$c °C = $k K\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "4" -> {
                print("Enter Kelvin: ")
                val k = readln().toDoubleOrNull()
                if (k != null) {
                    val c = kelvinToCelsius(k)
                    println("$k K = $c °C\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "5" -> {
                print("Enter Fahrenheit: ")
                val f = readln().toDoubleOrNull()
                if (f != null) {
                    val k = fahrenheitToKelvin(f)
                    println("$f °F = $k K\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "6" -> {
                print("Enter Kelvin: ")
                val k = readln().toDoubleOrNull()
                if (k != null) {
                    val f = kelvinToFahrenheit(k)
                    println("$k K = $f °F\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "b" -> return // go back to main menu
            else -> println("Invalid choice, try again.\n")
        }
    }
}

// --------------------- Distance Menu ---------------------
fun runDistanceMenu() {
    while (true) {
        println("\n=== DISTANCE CONVERSIONS ===")
        println("1) Miles to Kilometers")
        println("2) Kilometers to Miles")
        println("3) Feet to Meters")
        println("4) Meters to Feet")
        println("b) Back to Main Menu")

        print("Choose an option: ")
        when (readln().trim().lowercase()) {
            "1" -> {
                print("Enter Miles: ")
                val miles = readln().toDoubleOrNull()
                if (miles != null) {
                    val km = milesToKilometers(miles)
                    println("$miles mi = $km km\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "2" -> {
                print("Enter Kilometers: ")
                val km = readln().toDoubleOrNull()
                if (km != null) {
                    val miles = kilometersToMiles(km)
                    println("$km km = $miles mi\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "3" -> {
                print("Enter Feet: ")
                val ft = readln().toDoubleOrNull()
                if (ft != null) {
                    val m = feetToMeters(ft)
                    println("$ft ft = $m m\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "4" -> {
                print("Enter Meters: ")
                val m = readln().toDoubleOrNull()
                if (m != null) {
                    val ft = metersToFeet(m)
                    println("$m m = $ft ft\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "b" -> return
            else -> println("Invalid choice, try again.\n")
        }
    }
}

// --------------------- Weight Menu ---------------------
fun runWeightMenu() {
    while (true) {
        println("\n=== WEIGHT CONVERSIONS ===")
        println("1) Pounds to Kilograms")
        println("2) Kilograms to Pounds")
        println("3) Ounces to Grams")
        println("4) Grams to Ounces")
        println("b) Back to Main Menu")

        print("Choose an option: ")
        when (readln().trim().lowercase()) {
            "1" -> {
                print("Enter Pounds: ")
                val pounds = readln().toDoubleOrNull()
                if (pounds != null) {
                    val kg = poundsToKilograms(pounds)
                    println("$pounds lb = $kg kg\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "2" -> {
                print("Enter Kilograms: ")
                val kg = readln().toDoubleOrNull()
                if (kg != null) {
                    val lb = kilogramsToPounds(kg)
                    println("$kg kg = $lb lb\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "3" -> {
                print("Enter Ounces: ")
                val oz = readln().toDoubleOrNull()
                if (oz != null) {
                    val g = ouncesToGrams(oz)
                    println("$oz oz = $g g\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "4" -> {
                print("Enter Grams: ")
                val grams = readln().toDoubleOrNull()
                if (grams != null) {
                    val oz = gramsToOunces(grams)
                    println("$grams g = $oz oz\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "b" -> return
            else -> println("Invalid choice!\n")
        }
    }
}

// --------------------- Speed Menu ---------------------
fun runSpeedMenu() {
    while (true) {
        println("\n=== SPEED CONVERSIONS ===")
        println("1) Miles/hour to Kilometers/hour")
        println("2) Kilometers/hour to Miles/hour")
        println("b) Back to Main Menu")

        print("Choose an option: ")
        when (readln().trim().lowercase()) {
            "1" -> {
                print("Enter speed in mph: ")
                val mph = readln().toDoubleOrNull()
                if (mph != null) {
                    val kph = milesPerHourToKiloMetersPerHour(mph)
                    println("$mph mph = $kph km/h\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "2" -> {
                print("Enter speed in km/h: ")
                val kmh = readln().toDoubleOrNull()
                if (kmh != null) {
                    val mph = kilometersPerHourToMilesPerHour(kmh)
                    println("$kmh km/h = $mph mph\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "b" -> return
            else -> println("Invalid choice, try again.\n")
        }
    }
}

// --------------------- Base Conversions Menu ---------------------
fun runBaseMenu() {
    while (true) {
        println("\n=== BASE CONVERSIONS ===")
        println("1) Decimal to Binary")
        println("2) Binary to Decimal")
        println("3) Decimal to Hex")
        println("4) Hex to Decimal")
        println("b) Back to Main Menu")

        print("Choose an option: ")
        when (readln().trim().lowercase()) {
            "1" -> {
                print("Enter a decimal integer: ")
                val dec = readln().toIntOrNull()
                if (dec != null) {
                    val binaryStr = decimalToBinary(dec)
                    println("$dec in binary is $binaryStr\n")
                } else {
                    println("Invalid integer!\n")
                }
            }
            "2" -> {
                print("Enter a binary string: ")
                val bin = readln().trim()
                try {
                    val decimalVal = binaryToDecimal(bin)
                    println("$bin in decimal is $decimalVal\n")
                } catch (e: Exception) {
                    println("Invalid binary input!\n")
                }
            }
            "3" -> {
                print("Enter a decimal integer: ")
                val dec = readln().toIntOrNull()
                if (dec != null) {
                    val hexStr = decimalToHex(dec)
                    println("$dec in hex is $hexStr\n")
                } else {
                    println("Invalid integer!\n")
                }
            }
            "4" -> {
                print("Enter a hex string: ")
                val hexInput = readln().trim()
                try {
                    val decimalVal = hexToDecimal(hexInput)
                    println("$hexInput in decimal is $decimalVal\n")
                } catch (e: Exception) {
                    println("Invalid hex input!\n")
                }
            }
            "b" -> return
            else -> println("Invalid choice, try again.\n")
        }
    }
}

// --------------------- Arithmetic Operations Menu ---------------------
fun runOperationsMenu() {
    while (true) {
        println("\n=== ARITHMETIC OPERATIONS ===")
        println("1) Add Numbers")
        println("2) Subtract Numbers")
        println("3) Multiply Numbers")
        println("4) Divide Numbers")
        println("5) Exponentiation")
        println("6) Square Root (single argument)")
        println("b) Back to Main Menu")

        print("Choose an option: ")
        val choice = readln().trim().lowercase()

        when (choice) {
            "1" -> {
                print("Enter first number: ")
                val n1 = readln().toDoubleOrNull()
                print("Enter second number: ")
                val n2 = readln().toDoubleOrNull()
                if (n1 != null && n2 != null) {
                    val result = addNumbers(n1, n2)
                    println("$n1 + $n2 = $result\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "2" -> {
                print("Enter first number: ")
                val n1 = readln().toDoubleOrNull()
                print("Enter second number: ")
                val n2 = readln().toDoubleOrNull()
                if (n1 != null && n2 != null) {
                    val result = subtractNumbers(n1, n2)
                    println("$n1 - $n2 = $result\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "3" -> {
                print("Enter first number: ")
                val n1 = readln().toDoubleOrNull()
                print("Enter second number: ")
                val n2 = readln().toDoubleOrNull()
                if (n1 != null && n2 != null) {
                    val result = multiplyNumbers(n1, n2)
                    println("$n1 * $n2 = $result\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "4" -> {
                print("Enter first number: ")
                val n1 = readln().toDoubleOrNull()
                print("Enter second number: ")
                val n2 = readln().toDoubleOrNull()
                if (n1 != null && n2 != null) {
                    val result = divideNumbers(n1, n2)
                    println("$n1 / $n2 = $result\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "5" -> {
                print("Enter the base: ")
                val base = readln().toDoubleOrNull()
                print("Enter the exponent: ")
                val exp = readln().toDoubleOrNull()
                if (base != null && exp != null) {
                    val result = exponentiationNumbers(base, exp)
                    println("$base ^ $exp = $result\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "6" -> {
                print("Enter the number: ")
                val n = readln().toDoubleOrNull()
                if (n != null) {
                    val sqrtVal = squareRootNumber(n)
                    println("sqrt($n) = $sqrtVal\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "b" -> return
            else -> println("Invalid choice!\n")
        }
    }
}

// --------------------- Time Conversions Menu ---------------------
fun runTimeMenu() {
    while (true) {
        println("\n=== TIME CONVERSIONS ===")
        println("1) Seconds to Minutes")
        println("2) Minutes to Seconds")
        println("3) Hours to Minutes")
        println("4) Minutes to Hours")
        println("5) Seconds to Hours")
        println("6) Hours to Seconds")
        println("b) Back to Main Menu")

        print("Choose an option: ")
        when (readln().trim().lowercase()) {
            "1" -> {
                print("Enter Seconds: ")
                val sec = readln().toDoubleOrNull()
                if (sec != null) {
                    val minutes = secondsToMinutes(sec)
                    println("$sec seconds = $minutes minutes\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "2" -> {
                print("Enter Minutes: ")
                val min = readln().toDoubleOrNull()
                if (min != null) {
                    val seconds = minutesToSeconds(min)
                    println("$min minutes = $seconds seconds\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "3" -> {
                print("Enter Hours: ")
                val hrs = readln().toDoubleOrNull()
                if (hrs != null) {
                    val minutes = hoursToMinutes(hrs)
                    println("$hrs hours = $minutes minutes\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "4" -> {
                print("Enter Minutes: ")
                val min = readln().toDoubleOrNull()
                if (min != null) {
                    val hours = minutesToHours(min)
                    println("$min minutes = $hours hours\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "5" -> {
                print("Enter Seconds: ")
                val sec = readln().toDoubleOrNull()
                if (sec != null) {
                    val hours = secondsToHours(sec)
                    println("$sec seconds = $hours hours\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "6" -> {
                print("Enter Hours: ")
                val hrs = readln().toDoubleOrNull()
                if (hrs != null) {
                    val secs = hoursToSeconds(hrs)
                    println("$hrs hours = $secs seconds\n")
                } else {
                    println("Invalid input!\n")
                }
            }
            "b" -> return
            else -> println("Invalid choice!\n")
        }
    }
}

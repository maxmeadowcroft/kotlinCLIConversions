package main.kotlin.com.conversions

import main.kotlin.com.conversions.menu.*

fun main() {
    while (true) {
        println("=== MAIN MENU ===")
        println("1) Temperature Conversions")
        println("2) Distance Conversions")
        println("3) Weight Conversions")
        println("4) Speed Conversions")
        println("5) Base Conversions (decimal ↔ binary, etc.)")
        println("6) Arithmetic Operations (add, multiply, etc.)")
        println("7) Time Conversions")
        println("q) Quit")

        print("Choose an option: ")
        when (readln().trim().lowercase()) {
            "1" -> runTemperatureMenu()
            "2" -> runDistanceMenu()
            "3" -> runWeightMenu()
            "4" -> runSpeedMenu()
            "5" -> runBaseMenu()
            "6" -> runOperationsMenu()
            "7" -> runTimeMenu()
            "q" -> {
                println("Exiting...")
                return
            }
            else -> println("Invalid choice, try again.\n")
        }
    }
}

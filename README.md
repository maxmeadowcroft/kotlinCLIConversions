# Kotlin Conversions CLI

A **menu-driven command-line application** built in Kotlin for performing various unit conversions and arithmetic operations. This CLI project is organized into multiple sub-menus (Temperature, Distance, Weight, Speed, Time, Number Bases, and more) and demonstrates how to structure a Kotlin console application with clear separation of concerns.

---

## Features

1. **Temperature** Conversions
   - Celsius ↔ Fahrenheit ↔ Kelvin  
2. **Distance** Conversions
   - Miles ↔ Kilometers, Feet ↔ Meters  
3. **Weight** Conversions
   - Pounds ↔ Kilograms, Ounces ↔ Grams  
4. **Speed** Conversions
   - mph ↔ km/h  
5. **Time** Conversions
   - Seconds ↔ Minutes ↔ Hours  
6. **Base** Conversions
   - Decimal ↔ Binary ↔ Hexadecimal  
7. **Arithmetic Operations**
   - Add, Subtract, Multiply, Divide, Exponentiation, Square Root, etc.  

Each category has its own **menu** that prompts the user for the appropriate values, calls the relevant functions, and prints out the results.

---

## Project Structure

```
src/
 └─ main/
     └─ kotlin/
         └─ main/
             └─ kotlin/
                 └─ com/
                     └─ conversions/
                         ├─ base/           # Base conversion functions
                         ├─ distance/       # Distance conversion functions
                         ├─ menu/           # Menu definitions
                         ├─ operations/     # Arithmetic operations
                         ├─ speed/          # Speed conversion functions
                         ├─ temperature/    # Temperature conversion functions
                         ├─ time/           # Time conversion functions
                         └─ weight/         # Weight conversion functions
                         └─ Main.kt         # Main entry point (or separate as needed)
```

- **menu/**: Contains Kotlin files that define the sub-menus (e.g., `runTemperatureMenu()`, `runDistanceMenu()`, etc.).  
- Each **category** folder (e.g., `temperature/`) has top-level Kotlin functions for conversions in that domain.  

---

## How It Works

- **Main Menu**: Allows the user to pick a category (Temperature, Distance, Weight, etc.) or to quit.
- **Sub-Menu**: Displays available conversions (e.g., “Celsius to Fahrenheit”), prompts the user for inputs, then calls the corresponding function to compute the result.
- **Returns to Menu**: The user can go back to the main menu at any time by typing “b.”

---

## Getting Started

### Prerequisites

- **Java 8+** (or higher)
- **Kotlin** (optional if using Gradle to run the project)
- **Gradle** (if you want to build/run via Gradle scripts)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/<YourUserName>/<RepositoryName>.git
   cd <RepositoryName>
   ```

2. *(Optional)* **Check/Install Kotlin**:
   ```bash
   # On macOS with Homebrew
   brew install kotlin
   # or using SDKMAN
   sdk install kotlin
   ```

3. **(If Gradle Project)** Run:
   ```bash
   ./gradlew run
   ```
   On Windows:
   ```bash
   gradlew.bat run
   ```

If you prefer **manual compilation** (without Gradle), you can do:
```bash
kotlinc src/main/kotlin/**/*.kt -include-runtime -d conversions-cli.jar
java -jar conversions-cli.jar
```

---

## Usage

After running the application, you’ll see a **main menu** similar to:

```
=== MAIN MENU ===
1) Temperature Conversions
2) Distance Conversions
3) Weight Conversions
4) Speed Conversions
5) Base Conversions
6) Arithmetic Operations
7) Time Conversions
q) Quit
Choose an option:
```

Press the **number** of the category you want to explore. Then follow the prompts to enter numerical values. Type **`b`** to go back to the main menu, or **`q`** to quit the application entirely.

### Example (Temperature)

```
=== TEMPERATURE CONVERSIONS ===
1) Celsius to Fahrenheit
2) Fahrenheit to Celsius
3) Celsius to Kelvin
4) Kelvin to Celsius
5) Fahrenheit to Kelvin
6) Kelvin to Fahrenheit
b) Back to Main Menu
Choose an option:
```
1. If you choose **1**, you’ll be asked: **“Enter Celsius:”**
2. Input **25**.
3. The application prints: **“25.0 °C = 77.0 °F”**.
4. You can then repeat or type **`b`** to go back.

---

## Adding New Conversions or Operations

1. Create a new Kotlin file or extend an existing one with your new function.
2. Reference that function in the **appropriate sub-menu** (`runWhateverMenu`) by adding a new `println("X) My New Conversion")` and handling it in the `when` block.
3. Rebuild (`./gradlew run`) or recompile and run again.


---

## Contributing

Feel free to submit **pull requests** or open issues if you want to propose new conversions or refactor existing code.

---


## Contact

- **LinkedIn** – [Maximus Meadowcroft](https://www.linkedin.com/in/maximus-meadowcroft/)
- **Project Link**: [Kotlin CLI](https://github.com/maxmeadowcroft/kotlinCLIConversions)
- **Python Community**: [If you are a Python Dev](skool.com/coder)

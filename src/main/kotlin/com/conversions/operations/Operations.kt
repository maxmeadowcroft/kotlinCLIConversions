package main.kotlin.com.conversions.operations

import kotlin.math.*

fun addNumbers(number1: Double, number2: Double): Double {
    return number1 + number2
}

fun subtractNumbers(number1: Double, number2: Double): Double {
    return number1 - number2
}

fun multiplyNumbers(number1: Double, number2: Double): Double {
    return number1 * number2
}

fun divideNumbers(number1: Double, number2: Double): Double {
    return number1 / number2
}

fun floorDivideNumbers(number1: Int, number2: Int): Int {
    return number1.floorDiv(number2)
}

fun exponentiationNumbers(number1: Double, number2: Double): Double {
    return number1.pow(number2)
}

fun squareRootNumber(number1: Double): Double {
    return sqrt(number1)
}

fun sinNumber(number1: Double): Double {
    return sin(number1)
}

fun cosNumber(number1: Double): Double {
    return cos(number1)
}

fun lnNumber(number1: Double): Double {
    return ln(number1)
}

fun logTenNumber(number1: Double): Double {
    return log(number1, 10.0)
}
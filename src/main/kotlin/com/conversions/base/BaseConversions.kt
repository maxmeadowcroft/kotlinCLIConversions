package main.kotlin.com.conversions.base

fun decimalToBinary(decimal: Int): String {
    return Integer.toBinaryString(decimal)
}

fun binaryToDecimal(binary: String): Int {
    return binary.toInt(2)
}

fun decimalToHex(decimal: Int): String {
    return Integer.toHexString(decimal)
}

fun hexToDecimal(hex: String): Int {
    return hex.toInt(16)
}
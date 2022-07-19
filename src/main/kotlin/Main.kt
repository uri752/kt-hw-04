package ru.netology

fun main() {
    val typeCard: String = "Maestro" //"Visa"
    val prevSum: Int = 75_000 * 100//35_000 * 100 // 35 тыщ руб в копейках
    val sum: Int = 15_000 * 100 // 15 тыщ руб в копейках

    val commission: Int = calcCommission(typeCard,prevSum, sum)
    println("Тип карты $typeCard, общие платежи $prevSum, текущий платеж $sum: комиссия $commission (коп.)")
}

fun calcCommission(typeCard: String = "VK Pay", prevSum: Int = 0, sum: Int): Int {
    var commision: Int = 0

    commision = when(typeCard) {
        "Mastercard", "Maestro" -> when {
            (prevSum + sum) in 300 * 100..75_000 * 100 -> 0
            else -> (sum * 0.6 / 100 + 20).toInt()
        }
        "Visa", "Мир" -> when {
            0.75 * sum < 35 * 100 -> 35 * 100
            else -> (0.75 / 100 * sum).toInt()
        }
        else -> 0 // VK Pay
    }

    return commision
}
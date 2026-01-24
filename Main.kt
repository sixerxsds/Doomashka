fun main() {
    val amount = 10000
    val minCommission = 35 * 100
    val commissionPercentage = 0.0075
    var commission = (amount * commissionPercentage).toInt()
    if (commission < minCommission) {
        commission = minCommission
    }
    println("Сумма перевода: $amount копеек")
    println("Комиссия: $commission копеек")
}
fun main() {
    val totalSpent = 1500.0
    val isMeloman = true
    fun calculateDiscountedPrice(totalSpent: Double, isMeloman: Boolean, price: Double): Double {
        var discount = 0.0
        when {
            totalSpent in 0.0..1000.0 -> discount = 0.0
            totalSpent in 1001.0..10000.0 -> discount = 100.0
            totalSpent > 10000.0 -> discount = price * 0.05
        }
        if (isMeloman) {
            if (discount == 0.0) {
                return price
            }
            val discountedPrice = price - discount
            return discountedPrice * 0.99
        }
        return price - discount
    }
    val price = 100.0
    val finalPrice = calculateDiscountedPrice(totalSpent, isMeloman, price)
    println("Цена без скидки: $price рублей")
    println("Цена после скидки: $finalPrice рублей")
}
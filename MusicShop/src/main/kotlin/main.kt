fun main() {
    val itemPrice = 100
    val itemCount = 121
    val discountOne = 100
    val discountStart = 1_000
    val discountMore = 10_000

    val totalPrice = itemPrice * itemCount
    val discountSecond = (totalPrice * 5) / 100

    val result = if(totalPrice > discountMore) totalPrice - discountSecond else if(totalPrice > discountStart) totalPrice - discountOne else totalPrice


    val customerRegular =
        // у меня совсем нет идей, как вычислить постоянных покупателей
    val discountRegular = result/100

    val finishResult = if(customerRegular true) result - discountRegular else result

    println("Сумма покупки $finishResult")
}

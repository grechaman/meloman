package ru.netology

fun main() {
    val conditionDiscount = 1000.0
    val conditionDiscountSecondStep = 10000.0
    val firstDiscount = 100.0
    val secondDiscount = 0.05
    val loyaltyDiscount = 0.01

    class Person(val name: String, val age: Int, val amount: Double, val regular: Boolean)

    val personAlex = Person("Alex", 18, 5000.0, true)
    val personAdam = Person("Adam", 17, 50.0, false)
    val personJohn = Person("John", 25, 15000.0, true)
    val personKate = Person("Kate", 19, 1500.0, false)

    fun discountCalculation(people: Person, amountBuy: Double): Double {
        val amountPay: Double = if (people.amount > conditionDiscount) {
            if (people.amount > conditionDiscountSecondStep) {
                amountBuy - amountBuy * secondDiscount
            } else amountBuy - firstDiscount
        } else amountBuy
        return when (people.regular) {
            true -> amountPay * (1 - loyaltyDiscount)
            false -> amountPay
        }
    }

    println(discountCalculation(personAlex, 2000.0))
    println(discountCalculation(personAdam, 2000.0))
    println(discountCalculation(personJohn, 5000.0))
    println(discountCalculation(personKate, 2000.0))
}

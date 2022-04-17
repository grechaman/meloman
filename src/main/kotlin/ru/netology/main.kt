package ru.netology

fun main() {
    val conditionDiscount = 1000
    val conditionDiscountSecondStep = 10000
    val firstDiscount = 100
    val secondDiscount = 0.05
    val loyaltyDiscount = 0.01

    class Person(val name: String, val age: Int, val amount: Int, val regular: Boolean)

    val personAlex = Person("Alex", 18, 5000, true)
    val personAdam = Person("Adam", 17, 50, false)
    val personJohn = Person("John", 25, 15000, true)
    val personKate = Person("Kate", 19, 1500, false)

    fun discountCalculation(people: Person, amountBuy: Int):Int {
        val amountPay = if (people.amount > conditionDiscount) {
            if (people.amount > conditionDiscountSecondStep) {
                amountBuy - amountBuy * secondDiscount
            } else amountBuy - firstDiscount
        } else amountBuy
        return if (people.regular) (amountPay-(amountPay*loyaltyDiscount)) else amountPay
    }

    println(discountCalculation(personAlex, 2000))
    println(discountCalculation(personAdam, 2000))
    println(discountCalculation(personJohn, 5000))
    println(discountCalculation(personKate, 2000))
}

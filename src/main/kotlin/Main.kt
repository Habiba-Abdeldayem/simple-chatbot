package org.example

import java.time.Year

fun main() {
    greet()
    remindName()
    guessAge()
    count()
    test()
}

fun greet() {
    val botName = "Aid"
    val birthYear = Year.now().value
    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")
}

fun remindName() {
    println("Please, remind me your name.")
    val userName = readln()
    println("What a great name you have, $userName!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val remainder3 = getValidateNumber()
    val remainder5 = getValidateNumber()
    val remainder7 = getValidateNumber()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val number = getValidateNumber()
    repeat(number + 1) { println("$it!") }
    println("Completed, have a nice day!")
}

fun test() {
    val question = "Why do we use methods?"
    val correctAnswer = 2
    val options = listOf(
        "1. To repeat a statement multiple times.",
        "2. To decompose a program into several small subroutines.",
        "3. To determine the execution time of a program.",
        "4. To interrupt the execution of a program."
    )
    println("Let's test your programming knowledge.")
    println(question)
    options.forEach { println(it) }
    while (getValidateNumber() != correctAnswer) {
        println("Please, try again.")
    }
    end()
}

fun end() {
    println("Congratulations, have a nice day!")
}

fun getValidateNumber(): Int {
    while (true) {
        val number = readln()
        try {
            if(number.toInt()<0) throw NumberFormatException()
            return number.toInt()
        } catch (e: NumberFormatException) {
            println("Please enter a positive number")
        }
    }
}
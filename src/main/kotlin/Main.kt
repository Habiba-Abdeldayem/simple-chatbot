package org.example

import java.time.Year

fun main() {

    val botName = "Aid"
    val birthYear = Year.now().value
    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")

    println("Please, remind me your name.")
    val userName = readln()
    println("What a great name you have, $userName!")

    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()
    val remainder7 = readln().toInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")

    println("Now I will prove to you that I can count to any number you want.")
    val number = readln().toInt()
    repeat(number + 1) { println("$it!") }
    println("Completed, have a nice day!")
}

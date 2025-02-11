package org.example

import java.time.Year
import java.util.Scanner

fun main() {

    val botName = "Aid"
    val birthYear = Year.now().value
    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")

    Scanner(System.`in`).use { scanner ->
        val userName = scanner.next()
        println("What a great name you have, $userName!")
    } // Scanner automatically closes here ✅

}

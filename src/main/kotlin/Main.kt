package org.example

import java.time.Year
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val botName = "Aid"
    val birthYear = Year.now().value
    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")

    val userName = scanner.next()
    println("What a great name you have, $userName!")

}

package org.example

import java.time.Year

fun main() {
    val botName = "Aid"
    val birthYear = Year.now().value
    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")
}

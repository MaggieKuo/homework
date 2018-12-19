package com.train

import java.util.*

fun main(args: Array<String>) {
    println("Please enter number of tickets: ")
    val scanner = Scanner(System.`in`)
    val total = scanner.nextInt()
    if (total>0){
        var roundTripTicket:Int
        do {
            println("How many round-trip tickets (lass then or equal to $total):")
            roundTripTicket = scanner.nextInt()
        }while (roundTripTicket>total)
        
        println("Total tickets: $total")
        println("Round-trip: $roundTripTicket")
        println("Total: ${Ticket1(roundTripTicket, 2000, 10).getTotalFare()}")
    }
}

class Ticket1(var num: Int,
              var fare: Int,
              var discount: Int){
    fun getTotalFare() = (fare - (fare*discount)/100)*num
}
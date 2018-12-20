package com.train

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var tickets : Int
    do{
        println("Please enter number of tickets: ")
        tickets = scanner.nextInt()
        if (tickets > 0){
            val booking = KBooking(tickets)
            booking.start()
            booking.print()
        }
    }while (tickets != -1)

}

class KBooking(val tickets: Int){
    private var roundTripTickets = 0
    private lateinit var scanner: Scanner
    init {
        scanner = Scanner(System.`in`)
    }

    fun start(){
        do {
            println("How many round-trip tickets (lass then or equal to $tickets):")
            roundTripTickets = scanner.nextInt()
        }while (roundTripTickets>tickets)
    }

    fun calculate() = KRoundTripTicket().getFare()* roundTripTickets +
            KOneWayTicket().getFare()*(tickets-roundTripTickets)

    fun print(){
        println("Total tickets: $tickets")
        println("Round-trip: $roundTripTickets")
        println("Total: ${calculate()}")
    }

}

open class KTicket(var fare: Int?,
                   var discount: Int?){
    fun getFare() = fare!! - (fare!! * discount!!)/100
}

class KRoundTripTicket() : KTicket(2000, 10)

class KOneWayTicket() : KTicket(1000, 0)

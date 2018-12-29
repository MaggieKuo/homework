package com.kotlin

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var tickets : Int
    do{
        tickets = scanner.input("Please enter number of tickets: ", {scanner.nextInt()})
//        println("Please enter number of tickets: ")
//        tickets = scanner.nextInt()
        if (tickets > 0){
            val booking = Booking(tickets)
            booking.start()
            booking.print()
        }
    }while (tickets != -1)

}


class Booking(val tickets: Int){
    private var roundTripTickets = 0
    private lateinit var scanner: Scanner
    init {
        scanner = Scanner(System.`in`)
    }

    fun start(){
        do {
            roundTripTickets = scanner.input("How many round-trip tickets (lass then or equal to $tickets):", {scanner.nextInt()})
//            println("How many round-trip tickets (lass then or equal to $tickets):")
//            roundTripTickets = scanner.nextInt()
        }while (roundTripTickets>tickets)
    }

    fun calculate() = KRoundTripTicket().getSaleAmount()* roundTripTickets +
            KOneWayTicket().getSaleAmount()*(tickets-roundTripTickets)

    fun print(){
        println("Total tickets: $tickets")
        println("Round-trip: $roundTripTickets")
        println("Total: ${calculate()}")
    }

}

open class Ticket(var fare : Int,
                   var discount: Int){
    
    fun getSaleAmount() = fare - (fare * discount)/100
}

class KRoundTripTicket() : Ticket(2000, 10)

class KOneWayTicket() : Ticket(1000, 0)

package com.train;

import java.util.Scanner;

public class Booking {
    private final Scanner scanner;
    private int tickets;
    private int roundTrips;
    private int totalAmount;

    public Booking(int tickets) {
        this.tickets = tickets;
        scanner = new Scanner(System.in);
    }

    public void start(){
        do {
            System.out.println("How many round-trip tickets (Less then or equal to " + tickets + ".): ");
            roundTrips = scanner.nextInt();
        }while (roundTrips > tickets);

        totalAmount = new RoundTripTicket().getFare()*roundTrips + new OneWayTicket().getFare()*(tickets-roundTrips);
    }

    public void print(){
        System.out.println("Total tickets: " + tickets);
        System.out.println("Round-trip: " + roundTrips);
        System.out.println("Total: " + totalAmount);
    }
}

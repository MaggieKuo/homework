package com.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int roundTrip = 0;
        int num = scanner.nextInt();
        do {
            System.out.println("How many round-trip tickets: ");
            roundTrip = scanner.nextInt();
        }while (roundTrip>num);

        List<Ticket> tickets = new ArrayList<>();
        for (int i = 0; i < roundTrip; i++) {
            tickets.add(new RoundTripTicket());
        }
        int oneWayTickets = num - roundTrip;
        for (int i = 0; i < oneWayTickets; i++) {
            tickets.add(new OneWayTicket());
        }
        int totalAmount = 0;
        for (Ticket ticket : tickets) {
            totalAmount += ticket.getFare();
        }

        System.out.println("Total tickets: " + num);
        System.out.println("Round-trip: " + roundTrip);
        System.out.println("Total: " + totalAmount);
    }
}

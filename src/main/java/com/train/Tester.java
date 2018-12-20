package com.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tickets = 0;
        do{
            System.out.println("Please enter number of tickets :\n" +
                    "(Please enter -1 to end the booking.) ");
            tickets = scanner.nextInt();
            if (tickets > 0) {
                Booking booking = new Booking(tickets);
                booking.start();
                booking.print();
            }
        } while (tickets != -1);

    }

}

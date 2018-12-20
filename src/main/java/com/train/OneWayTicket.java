package com.train;

public class OneWayTicket extends Ticket {
    public OneWayTicket() {
        this.discount = 0;
        this.type = Ticket.TYPE_ONE_WAY;
        this.fare = 1000;
    }
}

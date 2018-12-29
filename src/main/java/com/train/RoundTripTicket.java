package com.train;

import java.math.BigDecimal;

public class RoundTripTicket extends Ticket {
    public RoundTripTicket() {
        this.type = Ticket.TYPE_ROUND_TRIP;
        this.fare = 2000;
        this.discount = 0.1f;
    }
}

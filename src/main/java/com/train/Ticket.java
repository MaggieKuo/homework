package com.train;

import java.util.List;

public class Ticket {
    public static final int TYPE_ONE_WAY = 1;
    public static final int TYPE_ROUND_TRIP = 2;

    int type;
    int fare;

    // 1-100
    int discount;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getFare() {
        return fare - (fare * discount)/100;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}

package com.train;

import java.util.List;

public class Ticket {
    public static final int TYPE_ONE_WAY = 1;
    public static final int TYPE_ROUND_TRIP = 2;

    int type;
    int fare;

    float discount;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getFare() {
        return fare - (fare * discount);
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}

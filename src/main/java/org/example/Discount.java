package org.example;

public class Discount {
    private int discount;

    public int calculate(int points) {
        if (points >= 0 && points <= 99) {
            discount = 1;
        } if (points >= 100 && points <= 199) {
            discount = 3;
        } if (points >= 200 && points <= 499) {
            discount = 5;
        } if (points >= 500) {
            discount = 10;
        }
        return discount;
    }
}
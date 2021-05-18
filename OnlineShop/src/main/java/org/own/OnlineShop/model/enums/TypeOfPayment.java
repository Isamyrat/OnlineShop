package org.own.OnlineShop.model.enums;

public enum TypeOfPayment {
    CARD("Card"),
    CASH("Cash"),
    ONLINE("Online");

    private final String str;

    TypeOfPayment(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}

package org.own.OnlineShop.model.enums;

public enum Status {
    NOT_PAID("Not_Paid"),
    PAID("Paid"),
    CANCELED("Canceled");

    private final String str;

    Status(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}

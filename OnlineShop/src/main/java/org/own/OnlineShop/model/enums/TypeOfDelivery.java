package org.own.OnlineShop.model.enums;

public enum TypeOfDelivery {
    PICK_UP_POINT("Pick_Up_Point"),
    DELIVERY_SERVICE("Delivery_Service");

    private final String str;

    TypeOfDelivery(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}

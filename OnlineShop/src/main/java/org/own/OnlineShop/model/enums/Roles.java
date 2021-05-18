package org.own.OnlineShop.model.enums;

public enum Roles {
    DIRECTOR("Director"),
    OPERATOR("Operator"),
    USER("User");

    private final String str;

    Roles(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}

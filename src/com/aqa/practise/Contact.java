package com.aqa.practise;

public class Contact {
    private String name;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    private String number;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}

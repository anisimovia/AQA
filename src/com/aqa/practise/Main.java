package com.aqa.practise;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+7(908)-654-54-56", Model.IPHONE, 123);
        Phone phone3 = new Phone("+7(908)-654-54-55", Model.XIAOMI);

        Contact fred = new Contact("Fred", "+7(908)-654-54-56");
        Contact tom = new Contact("Tom", "+7(999)-654-54-56");

//        phone1.receiveCall(fred);
//        phone1.receiveCall(tom, "02.06.2026");
//        phone2.printFields();
//        phone3.printFields();
        phone1.sendMessage(Arrays.asList(fred, tom), "Hellow!!!");
    }
}

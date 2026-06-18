package Lesson4.practice.task6;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private static final int UNKNOWN_AGE = 0;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        Random random = new Random();
        this.name = "JohnDou_" + random.nextInt(100);
        this.age = UNKNOWN_AGE;
    }

    public void printPersons(){
        System.out.println("Человек: " + name + ", возраст: " + age);
    }

    public void changeAge(int newAge){
        this.age = newAge;
    }

}

package Lesson4.practice.task4;

import java.util.Random;

public class Cats {
    private String name;
    private CatType type;

    public Cats(String name, CatType type) {
        this.name = name;
        this.type = type;
    }

    public Cats(String name) {
        this(name, CatType.HOMELESS);
    }

    public Cats() {
        this("Cat_" + new Random().nextInt(10), CatType.HOMELESS);
    }

    public void printCats() {
        System.out.println("Name: " + this.name + ", Type: " + this.type);
    }
}

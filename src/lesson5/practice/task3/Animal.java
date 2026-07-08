package lesson5.practice.task3;

import java.util.List;

public class Animal {
    private Type type;
    private String name;
    private String food;
    private String location;

    public Animal(Type type, String name, String food, String location) {
        this.type = type;
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void makeNoise(){};
    public void eat(){};
    public void sleep(){};

}

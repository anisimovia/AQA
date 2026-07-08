package lesson5.practice.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog(Type.DOG, "Fred", "Meat", "Dog House", 4));
        animals.add(new Cat(Type.CAT, "Murka", "Fish", "House", 5));
        animals.add(new Horse(Type.HORSE, "Sivka", "Grass", "Field", "Orange"));

        Vet vet = new Vet();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}

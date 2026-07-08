package lesson5.practice.task3;

public class Vet {
    public void treatAnimal(Animal animal){
        System.out.println("Next to vet - " + animal.getType() + ": " + animal.getName() + ", location: " + animal.getLocation());
        animal.eat();
    }
}

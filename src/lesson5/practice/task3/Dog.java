package lesson5.practice.task3;

public class Dog extends Animal {
    private int legs;

    public Dog(Type type, String name, String food, String location, int legs) {
        super(type, name, food, location);
        this.legs = legs;
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog say gav");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat " + super.getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }
}

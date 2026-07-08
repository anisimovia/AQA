package lesson5.practice.task3;

public class Cat extends Animal{
    private int age;

    public Cat(Type type, String name, String food, String location, int age) {
        super(type, name, food, location);
        this.age = age;
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
        System.out.println("Cat say meu");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat " + super.getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep");
    }
}

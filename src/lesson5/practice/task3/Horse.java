package lesson5.practice.task3;

public class Horse extends Animal{
    private String colour;

    public Horse(Type type, String name, String food, String location, String colour) {
        super(type, name, food, location);
        this.colour = colour;
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
        System.out.println("Horse say igogo");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat " + super.getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleep");
    }
}

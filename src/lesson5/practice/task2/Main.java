package lesson5.practice.task2;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(250, "Toyota");
        Driver driver = new Driver("Tom", 30, 10);
        Car car = new Car("B", engine, driver, "Land Cruser");
        Lorry lorry = new Lorry("C", engine, driver, "Man", 3000);

        MoveDriver moveDriver = new MoveDriver();
        moveDriver.move(lorry);
    }
}

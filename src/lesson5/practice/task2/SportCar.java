package lesson5.practice.task2;

public class SportCar extends Car{
    private double speed;

    public SportCar(String carClass, Engine engine, Driver driver, String marka, double speed) {
        super(carClass, engine, driver, marka);
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}

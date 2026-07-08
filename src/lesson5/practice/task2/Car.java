package lesson5.practice.task2;

public class Car {
    private String carClass;
    private Engine engine;
    private Driver driver;
    private String marka;

    public Car(String carClass, Engine engine, Driver driver, String marka) {
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.marka = marka;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }
}

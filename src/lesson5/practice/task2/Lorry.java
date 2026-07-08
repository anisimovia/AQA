package lesson5.practice.task2;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carrying) {
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехали");
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}

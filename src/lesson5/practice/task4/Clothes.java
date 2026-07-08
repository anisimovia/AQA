package lesson5.practice.task4;

public abstract class Clothes {
    private Size size;
    private double cost;
    private Colour colour;

    public Clothes(Size size, double cost, Colour colour) {
        this.size = size;
        this.cost = cost;
        this.colour = colour;
    }

    public abstract String getDescription();

    public Size getSize() { return size; }
    public double getCost() { return cost; }
    public Colour getColour() { return colour; }

    // Проверка, является ли одежда детской
    public boolean isChildren() {
        return size.getEuroSize() == 32; // XXS - детский размер
    }
}

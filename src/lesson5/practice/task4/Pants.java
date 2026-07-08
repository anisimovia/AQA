package lesson5.practice.task4;

public class Pants extends Clothes {
    public Pants(Size size, double cost, Colour colour) {
        super(size, cost, colour);
    }

    @Override
    public String getDescription() {
        String type = isChildren() ? " [ДЕТСКАЯ]" : "";
        return "Штаны" + type + ", размер: " + super.getSize() +
                " (" + super.getSize().getSizeDescription() + ")" +
                ", цвет: " + super.getColour() +
                ", цена: " + super.getCost() + " руб.";
    }
}

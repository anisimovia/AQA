package lesson5.practice.task4;

public class Tie extends Clothes {
    public Tie(Size size, double cost, Colour colour) {
        super(size, cost, colour);
    }

    @Override
    public String getDescription() {
        String type = isChildren() ? " [ДЕТСКИЙ]" : "";
        return "Галстук" + type + ", размер: " + super.getSize() +
                " (" + super.getSize().getSizeDescription() + ")" +
                ", цвет: " + super.getColour() +
                ", цена: " + super.getCost() + " руб.";
    }
}

package lesson5.practice.task4;

public class Tshirt extends Clothes {
    public Tshirt(Size size, double cost, Colour colour) {
        super(size, cost, colour);
    }

    @Override
    public String getDescription() {
        String type = isChildren() ? " [ДЕТСКАЯ]" : "";
        return "Футболка" + type + ", размер: " + super.getSize() +
                " (" + super.getSize().getSizeDescription() + ")" +
                ", цвет: " + super.getColour() +
                ", цена: " + super.getCost() + " руб.";
    }
}

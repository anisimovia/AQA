package lesson5.practice.task4;

public class Skirt extends Clothes {
    public Skirt(Size size, double cost, Colour colour) {
        super(size, cost, colour);
    }

    @Override
    public String getDescription() {
        String type = isChildren() ? " [ДЕТСКАЯ]" : "";
        return "Юбка" + type + ", размер: " + super.getSize() +
                " (" + super.getSize().getSizeDescription() + ")" +
                ", цвет: " + super.getColour() +
                ", цена: " + super.getCost() + " руб.";
    }
}

package lesson5.practice.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<>();
        // Добавляем взрослую одежду
        clothes.add(new Tshirt(Size.M, 100, Colour.BLACK));
        clothes.add(new Pants(Size.L, 120, Colour.YELLOW));
        clothes.add(new Skirt(Size.S, 80, Colour.BLUE));
        clothes.add(new Tie(Size.M, 50, Colour.RED));

        // Добавляем детскую одежду
        clothes.add(new Tshirt(Size.XXS, 60, Colour.WHITE));    // Детская футболка
        clothes.add(new Pants(Size.XXS, 70, Colour.GREEN));      // Детские штаны
        clothes.add(new Skirt(Size.XXS, 55, Colour.RED));        // Детская юбка

        Atelier atelier = new Atelier();

        // Вывод всей одежды по категориям
        atelier.dressAll(clothes);
    }
}

package lesson5.practice.task4;

import java.util.ArrayList;

public interface Menswear {
    default void dressMan(ArrayList<Clothes> clothes) {
        System.out.println("=== Мужская одежда ===");
        boolean hasItems = false;
        for (Clothes item : clothes) {
            if (!(item instanceof Skirt) && !item.isChildren()) {
                System.out.println("- " + item.getDescription());
                hasItems = true;
            }
        }
        if (!hasItems) {
            System.out.println("Нет мужской одежды");
        }
        System.out.println();
    }
}

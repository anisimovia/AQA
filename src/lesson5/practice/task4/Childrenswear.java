package lesson5.practice.task4;

import java.util.ArrayList;

public interface Childrenswear {
    default void dressChildren(ArrayList<Clothes> clothes) {
        System.out.println("=== Детская одежда ===");
        boolean hasItems = false;
        for (Clothes item : clothes) {
            if (item.isChildren()) {
                System.out.println("- " + item.getDescription());
                hasItems = true;
            }
        }
        if (!hasItems) {
            System.out.println("Нет детской одежды");
        }
        System.out.println();
    }
}

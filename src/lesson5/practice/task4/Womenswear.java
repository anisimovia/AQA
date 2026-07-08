package lesson5.practice.task4;

import java.util.ArrayList;

public interface Womenswear {
    default void dressWomen(ArrayList<Clothes> clothes) {
        System.out.println("=== Женская одежда ===");
        boolean hasItems = false;
        for (Clothes item : clothes) {
            if (!(item instanceof Tie) && !item.isChildren()) {
                System.out.println("- " + item.getDescription());
                hasItems = true;
            }
        }
        if (!hasItems) {
            System.out.println("Нет женской одежды");
        }
        System.out.println();
    }
}

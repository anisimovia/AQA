package lesson5.practice.task4;

import java.util.ArrayList;

public class Atelier implements Menswear, Womenswear, Childrenswear {

    public void dressAll(ArrayList<Clothes> clothes) {
        System.out.println("========== АТЕЛЬЕ ==========");
        dressMan(clothes);
        dressWomen(clothes);
        dressChildren(clothes);
        System.out.println("==============================");
    }

    @Override
    public void dressMan(ArrayList<Clothes> clothes) {
        System.out.println("=== Мужская одежда ===");
        boolean hasItems = false;
        for (Clothes item : clothes) {
            if (!(item instanceof Skirt) && !item.isChildren()) {
                System.out.println("  👔 " + item.getDescription());
                hasItems = true;
            }
        }
        if (!hasItems) {
            System.out.println("  Нет мужской одежды");
        }
        System.out.println();
    }

    @Override
    public void dressWomen(ArrayList<Clothes> clothes) {
        System.out.println("=== Женская одежда ===");
        boolean hasItems = false;
        for (Clothes item : clothes) {
            if (!(item instanceof Tie) && !item.isChildren()) {
                System.out.println("  👗 " + item.getDescription());
                hasItems = true;
            }
        }
        if (!hasItems) {
            System.out.println("  Нет женской одежды");
        }
        System.out.println();
    }

    @Override
    public void dressChildren(ArrayList<Clothes> clothes) {
        System.out.println("=== Детская одежда ===");
        boolean hasItems = false;
        for (Clothes item : clothes) {
            if (item.isChildren()) {
                System.out.println("  🧒 " + item.getDescription());
                hasItems = true;
            }
        }
        if (!hasItems) {
            System.out.println("  Нет детской одежды");
        }
        System.out.println();
    }
}

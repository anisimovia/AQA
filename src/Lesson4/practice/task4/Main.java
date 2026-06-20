package Lesson4.practice.task4;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Вася",CatType.MAINCUN);
        Cats cat1 = new Cats("Doshik");
        Cats cat2 = new Cats();

        cat.printCats();
        cat1.printCats();
        cat2.printCats();
    }
}

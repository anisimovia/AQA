package lesson5.practice.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Printable> printable = new ArrayList<>();
//        printable.add(new Book("Крассное колесо"));
        printable.add(new Magazine("Комсомольская правда"));
//        printable.add(new Book("Война и мир"));
        printable.add(new Magazine("Крестьянский вестник"));

        System.out.println("______Печатаем все издания______");
        for(Printable item: printable){
            item.print();
        }

        System.out.println();
        Book.printBooks(printable);

        System.out.println();
        Magazine.printMagazines(printable);
    }
}

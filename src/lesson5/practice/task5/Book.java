package lesson5.practice.task5;

import java.util.List;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("- Книга: " + title);
    }

    public static void printBooks(List<Printable> printable){
        System.out.println("______Печатаем только книги______");
        int count = 0;
        for (Printable item: printable){
            if(item instanceof Book){
                item.print();
                count++;
            }
        }
        if (count == 0){
            System.out.println("Книг нет в наличии");
        }
    }
}

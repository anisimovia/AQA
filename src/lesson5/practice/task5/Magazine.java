package lesson5.practice.task5;

import java.util.List;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("- Журнал: " + title);
    }

    public static void printMagazines(List<Printable> printable){
        System.out.println("______Печатаем только журналы______");
        int count = 0;
        for (Printable item: printable){
            if(item instanceof Magazine){
                item.print();
                count++;
            }
        }
        if (count == 0){
            System.out.println("Журналов нет в наличии");
        }
    }
}

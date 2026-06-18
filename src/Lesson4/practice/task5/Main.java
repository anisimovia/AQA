package Lesson4.practice.task5;

public class Main {
    public static void main(String[] args) {
        DynamicArray list1 = new DynamicArray(3);
        DynamicArray list2 = new DynamicArray();

        list1.generateRandomData();
        list2.generateRandomData();

        list1.printList();
        list2.printList();
    }
}

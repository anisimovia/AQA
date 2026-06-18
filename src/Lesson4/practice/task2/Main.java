package Lesson4.practice.task2;

public class Main {
    public static void main(String[] args) {
        Variable variable = new Variable();
        variable.setA(2);
        variable.setB(3);

        variable.printA();
        variable.printB();

        System.out.println("Сумма переменных a и b = " + variable.sum());
        System.out.println("Наибольшее значение переменных a и b = " + variable.max());
    }
}

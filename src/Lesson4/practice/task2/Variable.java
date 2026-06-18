package Lesson4.practice.task2;

public class Variable {
    private int a;
    private int b;

    public void printA(){
        System.out.println("Переменная а = " + a);
    }

    public void printB(){
        System.out.println("Переменная b = " + b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int max(){
        return Math.max(a, b);
    }

}

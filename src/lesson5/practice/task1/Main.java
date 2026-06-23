package lesson5.practice.task1;

public class Main {
    public static void main(String[] args) {
        Manager tom = new Manager("Tom");
        tom.setBonus(100);

        Manager fred = new Manager("Fred");
        Manager hew = new Manager("Hew");

        tom.setMentor(fred);

        System.out.println(tom.studentFor(hew));
    }
}

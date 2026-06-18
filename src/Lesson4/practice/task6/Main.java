package Lesson4.practice.task6;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 19);
        Person person2 = new Person("Pol", 34);
        Person person3 = new Person();

        person3.changeAge(2);
        person1.printPersons();
        person2.printPersons();
        person3.printPersons();
    }
}

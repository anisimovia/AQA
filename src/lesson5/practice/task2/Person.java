package lesson5.practice.task2;

public class Person {
    private String fullName;
    private int age;


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}

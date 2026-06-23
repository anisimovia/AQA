package lesson5.practice.task1;

public class Employee {
    private final static int DEFAULT_SALARY = 100;
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary(){
        return DEFAULT_SALARY;
    }

    public boolean studentFor(Employee e) {
        return false;
    }

    public void setMentor(Employee employee) {
        System.out.println("Нет ментора");
    }
    public boolean worksFor(Employee e){
        return false;
    }
}

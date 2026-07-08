package lesson5.practice.task1;

public abstract class Employee implements Workable{
    private String name;
    private boolean tired;
    private boolean vacation;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSalary();

    public abstract boolean studentFor(Employee e);

    public abstract void setMentor(Employee employee);

    @Override
    public void work() {
        System.out.println("Усердно работает");
    }

    @Override
    public boolean isTired() {
        return tired;
    }

    @Override
    public void relax() {
        System.out.println("Отдыхает");
    }

    @Override
    public boolean getVacation() {
        return vacation;
    }

    public void setTired(boolean tired) {
        this.tired = tired;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }
}

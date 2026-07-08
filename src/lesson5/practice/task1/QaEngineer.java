package lesson5.practice.task1;

public class QaEngineer extends Employee {
    private static final int DEFAULT_QAENGINEER_SALARY = 1100;
    private int bonus;
    private Employee mentor;

    public QaEngineer(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return DEFAULT_QAENGINEER_SALARY;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean studentFor(Employee e) {
        return e.getName().equals(mentor.getName());
    }

    @Override
    public void setMentor(Employee employee) {
        this.mentor = employee;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public boolean isTired() {
        return super.isTired();
    }

    @Override
    public void relax() {
        super.relax();
    }

    @Override
    public boolean getVacation() {
        return super.getVacation();
    }
}

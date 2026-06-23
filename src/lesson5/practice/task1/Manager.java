package lesson5.practice.task1;

public class Manager extends Employee {
    private int bonus;
    private Employee mentor;

    public Manager(String name) {
        super(name);
    }

    public int getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public boolean studentFor(Employee e) {
        return e.getName().equals(mentor.getName());
    }

    @Override
    public void setMentor(Employee employee) {
        this.mentor = employee;
    }


    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}

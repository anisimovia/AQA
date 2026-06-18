package Lesson4;

public class Employee {
    private String name;
    private double salary;
    private static final double DEFAULT_SALARY = 50;
    private Company company;
    private int floor;

    public Employee(String name, double salary, int roomNumber){
        this.name = name;
        this.salary = salary;
        this.company = new Company("Style", "Cool company", 1);
        this.floor = new OfficeRoom(roomNumber).getFlore();
    }

    public Employee(String name){
        this.name = name;
        this.salary = DEFAULT_SALARY;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public Company getCompany() {
        return company;
    }

    public int getFloor() {
        return floor;
    }

    public void raiseSalary (double newSalary){
        this.salary = newSalary;
    }

    class OfficeRoom{
        private int roomNumber;
        private int flore;

        public int getFlore() {
            return roomNumber/10;
        }

        public OfficeRoom(int roomNumber) {
            this.roomNumber = roomNumber;
        }
    }
}

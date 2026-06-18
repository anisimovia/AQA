package Lesson4;

public class Main {
    public static void main(String[] args) {
//        Employee fred = new Employee("Fred", 100, 34);
//        Employee tom = new Employee("Tom");
//        tom.raiseSalary(100);
//
//        System.out.println(new StringBuilder().append("Сотрудник ").append(fred.getName()).append(", Компания = ").append(fred.getCompany().getName()).append(" (").append(fred.getCompany().getDescription()).append("),").append( " ЗП = ").append(fred.getSalary()).append(", Этаж = ").append(fred.getFloor()).toString());

        Company google = new Company("google", "faang", 2);
        Company facebook = new Company("facebook", "new meta", 3);

        System.out.print(google.getName());
    }
}

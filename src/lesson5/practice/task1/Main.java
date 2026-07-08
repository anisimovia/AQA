package lesson5.practice.task1;

public class Main {
    public static void main(String[] args) {
        Manager tom = new Manager("Tom");
        Manager fred = new Manager("Fred");
        Manager hew = new Manager("Hew");

//        tom.setMentor(fred);
//        hew.setBonus(300);
        tom.relax();
        tom.setTired(false);
        tom.setVacation(true);
        tom.getVacation();
        

//        System.out.println(tom.studentFor(fred));
//        System.out.println(tom.studentFor(hew));
//        System.out.println(hew.getSalary());

        QaEngineer dag = new QaEngineer("Dag");
        QaEngineer cole = new QaEngineer("Cole");
        QaEngineer sam = new QaEngineer("Sam");

//        dag.setMentor(cole);

        dag.work();
        dag.setTired(true);

//        System.out.println(dag.studentFor(cole));
//        System.out.println(dag.studentFor(sam));
//        System.out.println(dag.getSalary());
    }
}

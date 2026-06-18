package Lesson4.practice.task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Анисимов", "Игорь", "Александрович", "Челябинск", 1111, 1111);
        Customer customer2 = new Customer("Петров", "Петр", "Петрович", "Касли", 5111, 1671);
        Customer customer3 = new Customer("Иванов", "Иван", "Евгеньевич", "Сызрань", 5332, 1132);
        Customer customer4 = new Customer("Смолов", "Антон", "Александрович", "Самара", 5511, 2211);
        Customer customer5 = new Customer("Кротов", "Эльдар", "Евгеньевич", "Куйбышевск", 2345, 4567);

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        Customer longest = customers.get(0);
        for (Customer c: customers){
            if(c.getSerName().length() > longest.getSerName().length()){
                longest = c;
            }
        }
        System.out.println("Самая длинная фамилия  - " + longest.getSerName() + " у " + longest.getFirstName());
    }
}

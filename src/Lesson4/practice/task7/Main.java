package Lesson4.practice.task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Анисимов", "Игорь", "Александрович", "Челябинск", "1111", "1111"));
        customers.add(new Customer("Петров", "Петр", "Петрович", "Касли", "5111", "1671"));
        customers.add(new Customer("Иванов", "Иван", "Евгеньевич", "Сызрань", "5332", "1132"));
        customers.add(new Customer("Смолов", "Антон", "Александрович", "Самара", "5511", "2211"));
        customers.add(new Customer("Кротов", "Эльдар", "Евгеньевич", "Куйбышевск", "2345", "4567"));

        // Ищем покупателя с самой длинной фамилией циклом и перезаписываем его в переменную
        Customer longest = customers.get(0);
        for (Customer c: customers){
            if(c.getSerName().length() > longest.getSerName().length()){
                longest = c;
            }
        }
        System.out.println("Самая длинная фамилия  - " + longest.getSerName() + " у " + longest.getFirstName());

        // идем циклом по списку клиентов и выводим тех, у которых первая цифра кредитной карты = 5
        System.out.println("Адреса покупателей у которых первая цифра кредитной карты = 5:");
        for (Customer c: customers){
            if (c.getCardNumber().charAt(0) == '5'){
                System.out.println("- " + c.getAddress());
            }
        }
        // идем циклом по списку клиентов и выводим клиентов с отчеством Евгеньевич
        System.out.println("Покупатели с отчеством Евгеньевич:");
        for (Customer c: customers){
            if (c.getSecondName().equals("Евгеньевич")){
                System.out.println("- " + c.getFirstName());
            }
        }

    }
}

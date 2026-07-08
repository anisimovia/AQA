package lesson5.practice.task6;

/**
 * Класс для работы программы
 *
 * Создаем книги, список книг и домашнюю библиотеку
 * Используем методы по добавлению, удалению и сортировке книг
 *
 * @author Анисимов Игорь
 *
 * @version 1
 * @simce JDK 11
 */

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new Book("Book4", "Author2", Year.of(2021), 123));
        books.add(new Book("Book1", "Author4", Year.of(2024), 324));
        books.add(new Book("Book3", "Author1", Year.of(2025), 56));
        books.add(new Book("Book2", "Author3", Year.of(2022), 11));
        books.add(new Book("Book5", "Author5", Year.of(2023), 1234));
        books.add(new Book("Book7", "Author7", Year.of(2027), 7));

        HomeLibrary homeLibrary = new HomeLibrary(books);

        homeLibrary.addBook(new Book("Book6", "Author6", Year.of(2026), 666));

        homeLibrary.removeBook(new Book("Book7", "Author7", Year.of(2027), 7));

        homeLibrary.getSortedByTitle();

        homeLibrary.getSortedByAuthor();

        homeLibrary.getSortedByYearBooks();

        homeLibrary.getSortedByCountOfPagesBooks();
    }
}

package lesson5.practice.task6;

/**
 * Класс Book
 *
 * Содержит конструктор по созданию книг, геттеры, переписанные методы toString, equals, hashCode
 *
 * @author Анисимов Игорь
 *
 * @version 1
 * @simce JDK 11
 */

import java.time.Year;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Year year;
    private int countOfPages;

    public Book(String title, String author, Year year, int countOfPages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.countOfPages = countOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Year getYear() {
        return year;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    @Override
    public String toString() {
        return "- Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", countOfPages=" + countOfPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return countOfPages == book.countOfPages && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, countOfPages);
    }
}

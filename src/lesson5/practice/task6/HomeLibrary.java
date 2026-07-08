package lesson5.practice.task6;

/**
 * Класс домашняя библиотека
 *
 * Содержит конструктор по созданию домашней библиотеки из списка книг и методы по добавлению, удалению книг из библиотеки, а также методы по сортировке книг
 *
 * @author Анисимов Игорь
 *
 * @version 1
 * @simce JDK 11
 */

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class HomeLibrary {
    List<Book> books;

    public HomeLibrary(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    private List<Book> sortBooks(Comparator<Book> comparator){
        List<Book> sortedBooks = new LinkedList<>(books);
        sortedBooks.sort(comparator);
        return sortedBooks;
    }

    public void getSortedByTitle(){
        System.out.println();
        System.out.println("======Sorted by title books======");
        for(Book book: sortBooks(Comparator.comparing(Book::getTitle))){
            System.out.println(book.toString());
        }
    }

    public void getSortedByAuthor(){
        System.out.println();
        System.out.println("======Sorted by author books======");
        for (Book book : sortBooks(Comparator.comparing(Book::getAuthor))){
            System.out.println(book.toString());
        }
    }

    public void getSortedByYearBooks(){
        System.out.println();
        System.out.println("======Sorted by year books======");
        for (Book book : sortBooks(Comparator.comparing(Book::getYear))) {
            System.out.println(book);
        }
    }

    public void getSortedByCountOfPagesBooks(){
        System.out.println();
        System.out.println("======Sorted by count of pages books======");
        for (Book book : sortBooks(Comparator.comparing(Book::getCountOfPages))) {
            System.out.println(book.toString());
        }
    }
}

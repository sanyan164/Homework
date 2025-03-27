package Lesson5.Task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Library library = new Library();
        Book book1 = new Book("Профессиональная разработка на Python", "Мэттью Уилкс", 2021);
        Book book2 = new Book("Грокаем алгоритмы", "Бхаргава Адитья", 2022);
        Book book3 = new Book("Грокаем алгоритмы. Иллюстрированное пособие для программистов и любопытствующих", "Бхаргава Адитья", 2023);
        Book book4 = new Book("Секреты Python Pro", "Мэттью Уилкс", 2023);

        // Добавляем книги с ISBN,который отсутствует в библиотеке
        library.addBook("9783127323207", book1);
        library.addBook("9785446109234", book2);
        library.addBook("978-1-34-571080-3", book3);
        library.addBook("49852562652562", book4);

        // Добавляем книгу с существующим ISBN
        library.addBook("9783127323207", new Book("Война и мир", "Лев Толстой", 1869));

        // Удаление существующей книги
        library.removeBook("9783127323207");

        // Удаление НЕсуществующей книги
        library.removeBook("9783127323208");

        //Запрос автора
        System.out.println("Введите автора, книги которого вы хотите посмотреть: ");
        String author = inp.nextLine();

        // Вывод книг по автору
        ArrayList<Book> auhorBooks = library.findBooksByAuthor(author);
        if (auhorBooks.isEmpty()){
            System.out.println("У введенного автора отсутствуют книги в Библиотеке!");
        }
        else {
            for (Book book : auhorBooks) {
                System.out.println(book.author + ": "+ book.title + ". Год издания: " +  book.year);
            }
        }
    }
}

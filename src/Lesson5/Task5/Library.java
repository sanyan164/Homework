package Lesson5.Task5;

import java.util.HashMap;
import java.util.ArrayList;

public class Library {
    HashMap<String, Book> map;
    public Library() {
        this.map = new HashMap<>();
    }
    public void addBook(String isbn, Book book) {
        if (map.containsKey(isbn)) {
            System.out.println("В библиотеке уже содержится книга с ISBN: " + isbn);
        }else {
            map.put(isbn, book);
        }
    }

    public void removeBook(String isbn) {
        if (map.containsKey(isbn)) {
            map.remove(isbn);
        }
         else {
            System.out.println("Невозможно удалить книгу с ISBN: " + isbn + ". Поскольку она отсутствует в билиотеке.");
        }
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : map.values()) {
            if (book.author.equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}

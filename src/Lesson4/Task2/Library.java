package Lesson4.Task2;
import java.util.ArrayList;

public class Library {
    ArrayList<String> books = new ArrayList<>();
    public void addBook(String book) {
        books.add(book);
    }
    public void removeBook(String book) {
        books.remove(book);
    }
    public void displayBooks() {
        System.out.println("Книги которые содержаться в библиотеке: ");
        for(String i : this.books) {
            System.out.println(i);
        }
    }
}

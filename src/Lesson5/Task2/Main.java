package Lesson5.Task2;

public class Main {
    public static void main(String[] args) {
        Library book = new Library();
        book.addBook("Грокаем алгоритмы");
        book.addBook("Секреты Python Pro");
        book.addBook("Что такое тестирование. Курс молодого бойца ");
        book.addBook("Мама, я тимлид! Практические советы по руководству IT-командой");
        book.removeBook("Секреты Python Pro");
        book.displayBooks();
    }
}

package Lesson4.Task1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student person = new Student();
        person.name = "Игорь";
        person.grades = new int[]{5, 4, 3, 2};
        person.printInfo();
    }
}

package Lesson4.Task1;

public class Student {
    String name;
    int[] grades;
    public void printInfo() {
        System.out.println("Имя ученика: " + this.name);
        System.out.print("Его оценки: ");
        for(int i : this.grades) {
            System.out.print(i + " ");
        }

    }
}
package Lesson5.Task1;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student igor = new Student("Игорь", 22,new ArrayList<>(Arrays.asList(4, 5, 5, 4, 5)));
        Student slava = new Student("Слава", 26,new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5)));
        Student tema = new Student("Артем", 27);

        students.add(igor);
        students.add(slava);
        students.add(tema);

        tema.addGrade(3);
        tema.addGrade(4);
        tema.addGrade(5);
        for (Student student: students){
            System.out.println("У студента: " + student.name + ". Средний балл: " + student.getAverageGrade());
        }
    }
}

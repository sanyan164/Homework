package Lesson5.Task1;
import java.util.ArrayList;


public class Student {
    String name;
    int age;
    ArrayList<Integer> grades = new ArrayList<>();
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, ArrayList<Integer> grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getAverageGrade(){
        int sum=0;
        for (int i:grades){
            sum+=i;
        }
        return (double) sum/ grades.size();
    }
}

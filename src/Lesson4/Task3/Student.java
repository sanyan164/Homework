package Lesson4.Task3;

public class Student {
    String name;
    int[] grades;
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public double calculateAverage(){
        int sum=0;
        for (int i:grades){
            sum+=i;
        }
        return (double) sum/ grades.length;
    }
}

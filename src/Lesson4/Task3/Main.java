package Lesson4.Task3;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Игорь", new int[]{5,4,5,4,5,4});
        students[1] = new Student("Александр", new int[]{4,4,5,5,4,3,5});
        students[2] = new Student("Николай", new int[]{5,2,5,5,5,4,5});

        double bestgrades =2.0;
        String bestName = "Александр";
        for (Student student: students){
            double sred=student.calculateAverage();
            if (sred>bestgrades){
                bestgrades = sred;
                bestName = student.name;
            }
        }
        System.out.println("Лучшим студентом является: " + bestName + ". Его средний балл: " + bestgrades);
    }
}

package Lesson5.Task2;
import Lesson5.Task1.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> lines = new ArrayList<>();
        System.out.println("Введите строки (Для остановки используется слово 'end'):");
        while (true) {
            String str = inp.nextLine();
            if (str.equals("end")) {
                break;
            }
            hashSet.add(str);
        }
        System.out.println("Количество уникальных строк: " + hashSet.size());

        //Заполнения массива lines, подходящими под условие строками (>5 с цифрами)
        for (String s : hashSet){
            if (s.length()>5 && ContentOfNumbers.contentOfNumbers(s)){
                lines.add(s);
            }
        }
        //Проверка, присутствуют ли строки (>5 с цифрами)
        if (lines.size()==0){
            System.out.println("Строки длинной больше пяти (Содержащие цифры) - отсутствуют");
        }
        else{
            System.out.println("Строки длинной больше пяти (Содержащие цифры): ");
            for(int i=0;i<lines.size();i++){
                System.out.println((i+1)+")"+lines.get(i));
            }
        }
    }
}

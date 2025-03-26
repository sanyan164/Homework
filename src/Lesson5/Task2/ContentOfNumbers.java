package Lesson5.Task2;

public class ContentOfNumbers {
    public static boolean contentOfNumbers(String s){
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }
}

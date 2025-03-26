package Lesson5.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>() {{
            add("apple");
            add("apple");
            add("apple");
            add("banana");
            add("banana");
            add("cherry");
        }};
        HashMap<String, Integer> map = new HashMap<>();
        for(String fruit : fruits){
            if(map.containsKey(fruit)){
                map.put(fruit, map.get(fruit)+1);
            }else{
                map.put(fruit, 1);
            }
        }
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            String end;
            String key = i.getKey();
            int value = i.getValue();
            if (value%10==2||value%10==3||value%10==4){
                end = " раза!";
            }else {
                end = " раз!";
            }
            System.out.println("Слово: '"+ key + "' встречается " + value+ end);
        }
    }
}

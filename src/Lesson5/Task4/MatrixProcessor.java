package Lesson5.Task4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MatrixProcessor {
    public static HashSet<Integer> findUniqueInMatrix(int[][] matrix){
        HashSet<Integer> rezul = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Считаем количество повторений каждого числа в матрице
        for (int[] mass : matrix) {
            for (int n : mass) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        // Добавляем добавляем только те числа,которые встречаются один раз
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() == 1) {
                rezul.add(i.getKey());
            }
        }
        return rezul;
    }
}

package Lesson5.Task4;

import java.util.HashSet;


public class Main extends MatrixProcessor{
    public static void main(String[] args) {
        int[][][] testMatrices = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}
                },
                {
                        {1, 0, 1},
                        {2, 5, 1},
                        {4, 5, 9}
                },
                {
                        {}
                }
        };
        for (int i = 0; i < testMatrices.length; i++) {
            System.out.println("Матрица " + (i+1) + ":");
            HashSet<Integer> one = findUniqueInMatrix(testMatrices[i]);
            System.out.println("Уникальные элементы матрицы: " + one + "\n");
        };
    }
}

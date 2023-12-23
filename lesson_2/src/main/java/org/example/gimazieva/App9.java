package org.example.gimazieva;

public class App9 {
    public static void matrixDiagonalFiller () {
        //int j = 0;
        int[][] numbers = new int[5][5];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    numbers[i][j] = 1;
                }
                int k = numbers.length - i -1;
                    numbers[i][k] = 1;
            }

        }

        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length; k++) {
                System.out.print(numbers[i][k] + " ");
            }
            System.out.println();
        }
        }
        public static void main (String[]args){
            matrixDiagonalFiller();
        }
}

// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
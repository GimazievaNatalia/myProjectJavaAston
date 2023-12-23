package org.example.gimazieva;

public class App7 {
    public static void fillMatrixNumbers(){
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i+1;
            System.out.println(numbers[i]);
        }
    }
    public static void main (String[]args) {
        fillMatrixNumbers();
    }
}








//Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
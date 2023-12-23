package org.example.gimazieva;

public class App6 {
    public static void replacementNumber() {
        int [] numbers = {1, 1, 1, 0, 0, 1, 0, 0, 0, 1};
        for (int i = 0 ; i < numbers.length ; i++) {
            if (numbers[i] == 0) {
                numbers[i] = numbers[i] + 1;
            }
            else{
                numbers[i] = numbers[i] - 1;
            }
            System.out.println(numbers[i]);
        }
    }
    public static void main (String[]args) {
        replacementNumber();
    }
}


// Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
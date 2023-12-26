package org.example.gimazieva;

public class App8 {
    public static void main(String[] args) {
        multiplyNumbersLessThanSix();
    }
    public static void multiplyNumbersLessThanSix() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 6;
            }
            System.out.println(numbers[i]);
        }
    }
}

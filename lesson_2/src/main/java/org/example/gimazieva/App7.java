package org.example.gimazieva;
public class App7 {
    public static void main(String[] args) {
        fillMatrixNumbers();
    }
    public static void fillMatrixNumbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }
}
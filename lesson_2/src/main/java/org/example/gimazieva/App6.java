package org.example.gimazieva;

public class App6 {
    public static void main(String[] args) {
        replacementNumber();
    }
    public static void replacementNumber() {
        int[] numbers = {1, 1, 1, 0, 0, 1, 0, 0, 0, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = numbers[i] + 1;
            } else {
                numbers[i] = numbers[i] - 1;
            }
            System.out.println(numbers[i]);
        }
    }
}
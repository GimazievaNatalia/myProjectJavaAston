package org.example.gimazieva;

public class App10 {
    public static void main(String[] args) {
        arrayInitializer(10, 1);
    }
    public static void arrayInitializer(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i]);
        }
    }
}
package org.example.gimazieva;
import java.util.Scanner;

public class App10 {
    public static void arrayInitializer(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i]);
        }
    }
    public static void main (String[]args) {
        arrayInitializer(10, 1);
    }
}


//Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
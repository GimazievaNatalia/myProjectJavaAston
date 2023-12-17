package org.example.gimazieva;

public class App
{
    public static void printThreeWords() {
        String[] words = {"Orange", "Banana", "Apple"};
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void checkSumSign(){
        int A = 1;
        int B = -1;
        int sum = A + B;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int  VALUE = 101;
        if (VALUE <= 0) {
            System.out.println("Красный");
        }
        if (VALUE > 0 && VALUE <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int A = 30;
        int B = 20;
        if (A >= B) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static void main( String[] args ) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}


package org.example.gimazieva;

public class App3 {
    public static void main(String[] args) {
        checkNegativeNumber(20);
    }

    public static void checkNegativeNumber(int number) {
        if (number < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
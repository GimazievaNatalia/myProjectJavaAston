

package org.example.gimazieva;
public class App4 {
    public static void printMyText(String str, int number) {
        int counter = 1;
        while (counter <= number) {
            System.out.println(str);
            counter++;
        }

    }
    public static void main (String[]args) {
        printMyText("Hello world",2);
    }
}
//. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
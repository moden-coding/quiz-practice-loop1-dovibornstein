
/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int oddcount = 0;
        int evencount = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number % 2 == 0) {
                System.out.println("This number is even.");
                evencount++;
            } else {
                System.out.println("This number is odd.");
                oddcount++;
            }
            if (number == -1) {
                System.out.println("There was " + oddcount + " odd numbers.");
                System.out.println("There was " + evencount + " even numbers.");

            }
        }
    }
}

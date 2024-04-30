package Task.Week2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        /* Write a program to take two integer inputs from the user and print the sum and product of them. */

           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter an first integer number : ");
           int first = scanner.nextInt();

           System.out.println("Enter an second integer number : ");
           int second = scanner.nextInt();

           int sum = first + second ;
           System.out.println("The sum of two integer numbers is :" + sum);

           int product = first * second ;
           System.out.println("The product of two integer numbers is :" + product);

           scanner.close();

    }
}

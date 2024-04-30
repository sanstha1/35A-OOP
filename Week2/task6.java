package Task.Week2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        /* Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
          Finally, calculate the division of the thus obtained sum and product and print the result. */

           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter an first integer number : ");
           int first = scanner.nextInt();

           System.out.println("Enter an second integer number : ");
           int second = scanner.nextInt();

           int sum = first + second ;
           System.out.println("The sum of two integer numbers is :" + sum);

           int product = first * second ;
           System.out.println("The product of two integer numbers is :" + product);

           float division = product / sum ;
           System.out.println("The division of the sum and product of the entered number is:" + division);

           scanner.close();

    }
}

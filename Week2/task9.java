package Task.Week2;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        
        /* Ask user to give two double input for length and breadth of a rectangle
           and print area type casted to int. */

           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter the length of the given rectangle:");
           double length = scanner.nextDouble();

           System.out.println("Enter the breadth of the given rectangle:");
           double breadth = scanner.nextDouble();

           double area = length * breadth ;

           int areaInt = (int) area;

           System.out.println("The area of the given rectangle is : " + areaInt );

           scanner.close();
    }
}

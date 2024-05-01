package Task.Week2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        /* Take side of a square from user and print area and perimeter of it. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side of the square:");
        int side = scanner.nextInt();

        int perimeter = 4 * side;

        int area = side * side;

        System.out.println("The perimeter of the given square is : " + perimeter);

        System.out.println("The area of the given square is : " + area);

    }
}

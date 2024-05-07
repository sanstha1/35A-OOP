package Task.Week3;

import java.util.Scanner;

public class swichcase_task4 {
    public static void main(String[] args) {

        /* Implement a Java program that calculates the area of different shapes 
          (circle, rectangle, square, triangle) based on the user's choice using a switch case. */
        

        Scanner scan = new Scanner(System.in);

        System.out.println("1 denotes area of circle.");
        System.out.println("2 denotes area of rectangle.");
        System.out.println("3 denotes area of sqaure.");
        System.out.println("4 denotes area of triangle.");

        System.out.println("Enter the number (1-4) as per your desired shapes results : ");
        int number = scan.nextInt();

         double area = 0 ;

        switch(number){
            case 1:
            System.out.println("Enter the redius of the circle : ");
            double redius = scan.nextDouble();
            area = Math.PI * redius * redius;
            break;

            case 2:
            System.out.println("Enter the length of the rectangle : ");
            double length = scan.nextDouble();
            System.out.println("Enter the width of the rectangle : ");
            double width = scan.nextDouble();
            area = length * width;
            break;

            case 3:
            System.out.println("Enter the side length of the square : ");
            double side = scan.nextDouble();
            area = side * side;
            break;

            case 4:
            System.out.println("Enter the base length of the triangle : ");
            double base = scan.nextDouble();
            System.out.println("Enter the height of the triangle : ");
            double height = scan.nextDouble();
            area = 0.5 * base * height;
            break;

            default:
            System.out.println("Invalid number!!");
            return;
        }
        System.out.println("The area of your selected shape is : " + area );
        scan.close();
    }
}

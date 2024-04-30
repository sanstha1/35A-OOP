package Task.Week2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        /* Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base and height of the triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double Areatriangle = 0.5 * base * height;
        System.out.println("The area of the triangle is:" + Areatriangle);

        System.out.println("Enter the length, weidth, and height of cuboid:");
        double length = scanner.nextDouble();
        double weidth = scanner.nextDouble();
        double heightcuboid= scanner.nextDouble();
        double cuboidVolume = length * weidth * heightcuboid;
        System.out.println("The volume of cuboid is :" + cuboidVolume);

        System.out.println("Enter the side length of the cube:");
        double sidelength = scanner.nextDouble();
        double cubeVolume = Math.pow(sidelength, 3);
        System.out.println("The volume of the cube is :" + cubeVolume);
        
        scanner.close();
    }

    
}

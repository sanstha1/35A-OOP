package Task.Week4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        
        /*Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:

            *****

            *****

            *****

            *****

            ***** */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the width of the square:");
        int width = scan.nextInt();

        for(int i=0;i<width;i++){
            for(int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}

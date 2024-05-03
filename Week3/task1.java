package Task.Week3;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args){

        /*Write a JAVA program to find the maximum between three number. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = scan.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = scan.nextInt();

        int max = num1;

        if(num2>max){
            max=num2;            
        }
        if(num3>max){
            max=num3;
        }
        System.out.println("The maximum number between the three nums is : " + max);

        scan.close();

    }
}

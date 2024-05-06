package Task.Week3;

import java.util.Scanner;

public class switchcase_task1 {
    public static void main(String[] args) {

        /* Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. 
            Use a switch case statement to handle different grades. */

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the Student's grade as (A,B,C,D, or E) : ");
            char grade = scan.next().toUpperCase().charAt(0);

            double GPA ;

            switch(grade){
                case 'A' :
                GPA = 4.0;
                break;
                case 'B' :
                GPA = 3.0;
                break;
                case 'C' :
                GPA = 2.0;
                break;
                case 'D' :
                GPA = 1.0;
                break;
                case 'E' :
                GPA = 0.0;
                break;
                default :
                System.out.println("Invalid character!!");
                return;
            }
            System.out.println("The GPA value for grade " + grade + " is : " + GPA);
            scan.close();       
    }
}

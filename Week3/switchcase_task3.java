package Task.Week3;

import java.util.Scanner;

public class switchcase_task3 {
    public static void main(String[] args) {

        /*Write a Java program that takes an integer input (1 to 12) representing a month and 
         prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 - 12 representing 1 as January.....12 as december : ");
        int month = scanner.nextInt();

        String season;

        switch(month){
            case 1 :
            case 2 :
            case 3 :
            season = "Winter";
            break;

            case 4 :
            case 5 :
            case 6 :
            season = "Spring";
            break;

            case 7 :
            case 8 :
            case 9 :
            season = "Summer";
            break;

            case 10 :
            case 11 :
            case 12  :
            season = "Fall";
            break;

            default :
            System.out.println("Invalid month!!");
            return;
        }
        System.out.println(" Month " + month + " Falls under season " + season);

        scanner.close();
        


    }
}

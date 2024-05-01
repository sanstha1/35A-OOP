package Task.Week2;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        /*Write a program to calculate the total marks of four subjects of a student and the total percentage secured. 
          And use the following conditions to generate the final result;
          a. If equal to or more than 70 -> First Class
          b. If more than 59 -> Upper Second Class
          c. If more than 49 -> Second class
          d. If more than 39 -> Third class and if below than 40 the result is fail. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of four subjects:");

        int marks1 = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();
        int marks4 = scanner.nextInt();

        int total_marks = marks1 + marks2 + marks3 + marks4;

        float total_percentage = (total_marks * 100) / 400;

        String result = (total_percentage >= 70) ? "First class"
                    :(total_percentage > 59) ? "Upper Second Class"
                    :(total_percentage > 59) ? "Upper Second Class"
                    :(total_percentage > 49) ? "Second class"
                    :(total_percentage > 39) ? "Third class" : "Fail" ;

        System.out.println("Marks : " + total_marks);
        System.out.println("Percentage : " + total_percentage + "%");
        System.out.println("Final result : " + result);

        scanner.close();    
    }
}

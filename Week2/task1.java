package Task.Week2;

import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args) {

        /*Write a program to check whether a person can cast a vote or not. 
          The condition is you must be over 18 years old to vote. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        String result = (age > 18) ? "You are eligible to vote."
                                   : "You must be over 18 years old to vote your desired candidate.";
        
        System.out.println(result);

        scanner.close();
       
    }
    
}

package Task.Week2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){

        /*Write the ternary operator for question no. 1 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        String result = (age > 18) ? "You are eligible to vote."
                                   : "You must be over 18 years old to vote your desired candidate.";
        
        System.out.println(result);

        scanner.close();

    }
}

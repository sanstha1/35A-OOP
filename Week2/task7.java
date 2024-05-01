package Task.Week2;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        /*Take the name, roll number, and field of interest from the user 
         * and print in the format below:
         * Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Can you please tell me your name?");
        String name = scanner.nextLine();

        System.out.println("Can you please tell me your roll number?");        
        int roll_number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Can you please tell me your field of interest?");
        String field = scanner.nextLine();

        System.out.println("Hey, my name is " + name + "and my roll number is" + roll_number + "." + "My field of interest are" + field);


        scanner.close();   

    }
}

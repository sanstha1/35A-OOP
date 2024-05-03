package Task.Week3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        /*Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any alphabet : ");
        char alpha = scan.next().charAt(0);

        if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u'||
        alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U'){

            System.out.println("It is a vowel.");
        }else{
            System.out.println("It is a consonant.");
        }
    scan.close();


    }
}

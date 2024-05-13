package Task.Week4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        /*Write a program that asks your name and prints “Hello your name” five times. Use a loop. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scan.nextLine();

        for(int i = 0;i<=4;i++){
            System.out.println("Hello....my name is " + name);            
        }

        scan.close();


    }
}

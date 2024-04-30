package Task.Week2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        /* Write a program to calculate SI. 
           Formula Simple Interest = (PrincipleAmount*Time*Rate/100) */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principle:");
        double principle = scanner.nextDouble();

        System.out.println("Enter the time(in years):");
        double time = scanner.nextDouble();

        System.out.println("Enter the rate of interest in percentage:");
        double rate = scanner.nextDouble();

        double simpleInterest = (principle*time*rate)/100;

        System.out.println("Simple Interest :" + simpleInterest);

        scanner.close();

    }
}

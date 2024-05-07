package Task.Week3;

import java.util.Scanner;

public class switchcase_task2 {
    public static void main(String[] args) {

        /*Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and 
          performs the corresponding arithmetic operation using a switch case statement. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number : ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operater (+,-,*,/) that you desire :");
        char operater = scanner.next().charAt(0);

        double outcome;

        switch(operater){
            case '+':
            outcome = num1 + num2;
            break;
            case '-':
            outcome = num1 - num2;
            break;
            case '*':
            outcome = num1 * num2;
            break;
            case '/':
            if(num2 != 0){
                outcome = num1 / num2;
            }else{
                System.out.println("Error!!...Cannot be divisible by 0");
                return;
            }
            break;

            default:
            System.out.println("Unrecognizeable operator");
            return;

        }
        System.out.println("Expected outcome is : " + outcome);
        
        scanner.close();

    }
}

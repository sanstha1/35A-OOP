package Task.Week4;

public class task3 {
    public static void main(String[] args) {

        /*Write a program that generates the following table: 
         Number    Square
         10    100
         9    81
         ..   ...
         2    4
         1    1 */

         System.out.println("Number\tSquare");
         for (int i = 1; i <= 10; i++) {
             int square = i * i;
             System.out.println(i + "\t" + square);
         }
    }
}

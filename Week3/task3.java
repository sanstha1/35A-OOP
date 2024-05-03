package Task.Week3;

public class task3 {
    public static void main(String[] args){

        /*Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */

        int num = 22;

        if(num % 5 == 0){
            System.out.println("The number is divisible by 5 .");
        }else if(num % 11 == 0){
            System.out.println("The number is divisible by 11 .");
        }else{
            System.out.println("The number is not divisible by neither 5 or 11 .");
        }
    }
}

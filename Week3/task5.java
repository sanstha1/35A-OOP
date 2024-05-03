package Task.Week3;

public class task5 {
    public static void main(String[] args) {

        /*Write a JAVA program to check whether a year is a leap year or not.  */

        int year = 2007;

        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ) {
            System.out.println("It is a leap year.");
        }else{
            System.out.println("It is not a leap year.");
        }
    }
}

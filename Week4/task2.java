package Task.Week4;

public class task2 {
    public static void main(String[] args) {

        /*Write a program that displays the following table (note that 1 mile is 1.609 kilometers):

        Miles    Kilometers

        1          1.609
        2          3.218
        …           ….
        9          14.481
        10         16.090 */

        for(int i = 1;i<=10;i++){
            double km = i * 1.609;
            System.out.println(i + " Miles = " + km + " Kilometers ");
        }

       //Another way
        System.out.println("Miles\tKilometers");
        for (int i = 1; i <= 10; i++) {
            double km = i * 1.609;
            System.out.println(i + "\t" + km);
        }
    }
}

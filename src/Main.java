import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year");
        int year = myScan.nextInt();
        int digitOne = (year / 1000);
        System.out.println(digitOne);
        int digitTwo = ((year - (digitOne * 1000)) / 100);
        System.out.println(digitTwo);
        int yearTwo = (year - (digitOne * 1000));
        int digitThree = ((yearTwo - (digitTwo * 100)) / 10);
        System.out.println(digitThree);
        int digitFour = (year % 10);
        System.out.println(digitFour);
/* tests i did were going through each digit from 0,9 for the first digit then tested if the 1st digit is smaller then last and vice versa
a trouble i had was in digitThree the value after - was the same as digitTwo but after making it equal the value after digitTwo it worked
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran
// tests i did were going through each digit from 0,9 for the first digit then tested if the 1st digit is smaller then last and vice versa
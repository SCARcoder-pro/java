import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Check Leap year: ");
        int year = scn.nextInt();
        if (year%400==0) {
            System.out.println("Leap Year");
        } else if (year%100==0) {
            System.out.println("Not a Leap Year");
        } else if (year%4==0) {
            System.out.println("Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        scn.close();
    }
}
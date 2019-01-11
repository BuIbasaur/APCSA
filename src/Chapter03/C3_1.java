package Chapter03;

import java.util.Scanner;

/**
 * finds the current day and future day requires number input
 *
 * @author Max Tesch
 */
public class C3_1 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int Day = (int) input.nextDouble();
        System.out.print("Enter the number of days since the eclipsed since today: ");
        double F = input.nextDouble();
        int e = (int) F % 7 + Day;

        switch (Day) {
            case 1:
                System.out.print("today is Monday");
                break;
            case 2:
                System.out.print("Today is Tuesday");
                break;
            case 3:
                System.out.print("Today is Wednesday");
                break;
            case 4:
                System.out.print("Today is Thursday");
                break;
            case 5:
                System.out.print("Today is Friday");
                break;
            case 6:
                System.out.print("Today is Saturday");
                break;
            case 0:
                System.out.print("Today is Sunday");
                break;
        }
        switch (e) {
            case 1:
                System.out.print(" the future day is Monday");
                break;
            case 2:
                System.out.print(" the future day is Tuesday");
                break;
            case 3:
                System.out.print(" the future day is Wednesday");
                break;
            case 4:
                System.out.print(" the future day is Thursday");
                break;
            case 5:
                System.out.print(" the future day is Friday");
                break;
            case 6:
                System.out.print(" the future day is Saturday");
                break;
            case 0:
                System.out.print(" the future day is Sunday");
                break;
        }
        if (Day >= 6) {
            System.out.println("Invalid Day code");

        }
    }
}

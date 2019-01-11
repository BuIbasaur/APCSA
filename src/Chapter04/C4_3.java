package Chapter04;

import java.util.Scanner;

/**
 * Shows employs plays
 *
 * @author Max Tesch
 */
public class C4_3 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String N = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double H = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double R = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double FT = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double ST = input.nextDouble();

        System.out.println("Employee Name:" + N);
        System.out.println("Hours Worked:" + H);
        System.out.println("Pay Rate: $" + R);
        int GP = (int) (R * H);
        System.out.println("Gross Pay: $" + GP);
        System.out.println("Deduction:");
        System.out.printf("Federal Withholding (%.1f%%): $%.2f\n", FT * 100,
                FT * R * H);
        System.out.printf("State Withholding (%.1f%%): $%.2f\n", ST * 100,
                ST * R * H);
        System.out.printf("Total Deduction: $%.2f\n", (ST + FT) * R
                * H);
        System.out.printf("Net Pay: $%.2f\n", (1 - ST - FT) * R * H);

    }
}

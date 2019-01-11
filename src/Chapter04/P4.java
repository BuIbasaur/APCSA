package Chapter04;

import java.util.Scanner;

/**
 * shows which one won
 *
 * @author Max Tesch
 */
public class P4 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String B = input.next();
        System.out.print("Hours: ");
        int H = (int) input.nextDouble();
        System.out.print("Rate per hour: ");
        double M = input.nextDouble();
        System.out.print("Name: ");
        String B2 = input.next();
        System.out.print("Hours: ");
        int H2 = (int) input.nextDouble();
        System.out.print("Rate per hour: ");
        int M2 = (int) input.nextDouble();
        double HW = M * H;
        double HW2 = M2 * H2;
        if (HW < HW2) {
            System.out.println("---Bid Winner---");
            System.out.println("Winner: " + B);
            System.out.printf("Total cost: %.2f ", HW);

        } else if (HW > HW2) {
            System.out.println("---Bid Winner---");
            System.out.println("Winner: " + B2);
            System.out.printf("Total cost: %.2f ", HW2);
        } else if ((HW == HW2) && (H2 < H)) {
            System.out.println("---Bid Winner---");
            System.out.println("Winner: " + B2);
            System.out.printf(" with hours worked with of %.2f ", HW2);
            System.out.println("and worked a tottal of " + H2);
            System.out.println(" hours");
        } else if ((HW == HW2) && (H < H2)) {
            System.out.println("---Bid Winner---");
            System.out.println("Winner: " + B);
            System.out.printf(" with a hours work rate of %.2f ", M);
            System.out.print("and worked a tottal of " + H);
            System.out.println(" hours");
        } else if (HW == HW2) {
            System.out.print(B);
            System.out.print(" and " + B2
            );
            System.out.printf(" worked the same number of hours at an hourly rate of %.2f ", M);
        }

    }
}

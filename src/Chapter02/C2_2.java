package Chapter02;

import java.util.Scanner;

/**
 * Finds intrests of a number input
 *
 * @author Max Tesch
 */
public class C2_2 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate as a decimal");
        double b = input.nextDouble();
        double ir = input.nextDouble();
        double i = b * (ir / 1200);
        System.out.print("The interest is ");
        System.out.println(i);
    }
}

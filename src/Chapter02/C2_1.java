package Chapter02;

import java.util.Scanner;

/**
 * finds the acceleartion rate of number a input
 *
 * @author Max Tesch
 */
public class C2_1 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Volicity 1 is: ");

        double v0 = input.nextDouble();
        System.out.print("Volicity 2 is: ");
        double v1 = input.nextDouble();
        System.out.print("Time is [Plz put in seconds]: ");
        double T = input.nextDouble();

        double F = (v1 - v0) / T;
        System.out.print("acceleration is: " + F);
    }

}

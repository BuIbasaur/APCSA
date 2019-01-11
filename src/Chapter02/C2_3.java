package Chapter02;

import java.util.Scanner;

/**
 * finds the cost of driving (gas) requires number input
 *
 * @author Max Tesch
 */
public class C2_3 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance in miles");
        double d = input.nextDouble();
        System.out.println("Enter miles per gallon");
        double MPG = input.nextDouble();
        System.out.println("Enter price per gallon");
        double PPG = input.nextDouble();
        double TP = ((d / MPG) * PPG);
        System.out.print("The total cost of driving is $" + TP);
    }
}

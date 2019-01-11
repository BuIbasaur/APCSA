package Chapter03;

import java.util.Scanner;

/**
 * finds if its a proper fraction or not
 *
 * @author Max Tesch
 */
public class P3 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("what is the first number: ");
        double A = input.nextDouble();
        System.out.print("What is the second number: ");
        double B = input.nextDouble();
        if (A < B) {
            System.out.println("The first number is less than the second");
        }
        if (A > B) {
            System.out.println("The first number is greater than the second");
        }
        if (A == B) {
            System.out.println("The first number is equal to the second");
        }
        if (A <= B) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (A != B) {
            System.out.println("The first number is not equal to the second");
        }
        if (B == 0) {
            System.out.println("Cannot divide by zero");
        } else if (A / B < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("Improper fraction");
        }

        if (A >= 90) {
            System.out.println("A");
        } else if (A >= 80) {
            System.out.println("B");
        } else if (A >= 70) {
            System.out.println("C");
        } else if (A >= 60) {
            System.out.println("D");
        } else if (A <= 59) {
            System.out.println("F");
        }
        if ((B <= 100) && (B >= 1)) {
            System.out.println("In range");
        } else {
            System.out.println("out of range");
        }

    }
}

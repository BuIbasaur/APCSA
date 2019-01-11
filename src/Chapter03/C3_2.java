package Chapter03;

import java.util.Scanner;

/**
 * finds if the number inputed is a palindrome or not
 *
 * @author Max Tesch
 */
public class C3_2 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int P = (int) input.nextDouble();
        int A = P / 100;
        int B = P % 10;
        if (A == B) {
            System.out.print(P);
            System.out.print(" is a Palindrome");
        } else if (A != B) {
            System.out.print(P);
            System.out.println(" isn’t a Palindrome");
        }
    }
}

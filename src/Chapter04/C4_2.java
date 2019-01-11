package Chapter04;

import java.util.Scanner;

/**
 * says if something is a substring or not
 *
 * @author Max Tesch
 */
public class C4_2 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String s1: ");
        String A = input.nextLine();
        System.out.print("Enter String s2: ");
        String B = input.nextLine();

        if (A.contains(B)) {
            System.out.println(B + " is a substring of " + A);
        } else {
            System.out.println(B + " is not a substring of " + A);
        }

    }

}

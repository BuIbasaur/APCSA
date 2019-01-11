package Chapter02;

import java.util.Scanner;

/**
 * finds total price of a meal requires numbers input
 *
 * @author Max Tesch
 */
public class P2 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the price of meal: ");
        double Meal = input.nextDouble();
        System.out.print("What is the price of drink: ");
        double Drink = input.nextDouble();
        System.out.print("what is the price of dessert: ");
        double Dessert = input.nextDouble();
        double FinnalP = Meal + Drink + Dessert;
        System.out.println("total price for food is: " + FinnalP);
        double tax = FinnalP * .10;
        System.out.println("the tax is:" + tax);
        double tip = (FinnalP + tax) * .15;
        System.out.println("the tip is: " + tip);
        double tottal = tip + FinnalP + tax;
        System.out.println("total price: " + tottal);
    }
}

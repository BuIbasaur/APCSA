package Chapter03;

import java.util.Scanner;

/**
 * rock paper sissors game
 *
 * @author Max Tesch
 */
public class C3_3 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Scissor (0), Rock (1), Paper (2): ");
        int P = (int) input.nextDouble();
        int C = (int) (Math.random() * 3);

        OUTER:
        OUTER_1:
        OUTER_2:
        switch (P) {
            case 0:
                switch (C) {
                    case 0:
                        System.out.println(" The computer is Scissor. You are Scissors.It's a Draw");
                        break OUTER;
                    case 1:
                        System.out.println("The computer is Rock. You are Scissors. You lose");
                        break OUTER;
                    case 2:
                        System.out.println(" The computer is Paper. You are Scissors. You win");
                        break OUTER;
                    default:
                        break;
                }
            case 1:
                switch (C) {
                    case 0:
                        System.out.println("The computer is Scissor. You are Rock. You win");
                        break OUTER_1;
                    case 1:
                        System.out.println("The computer is Rock. You are Rock.It's is Draw");
                        break OUTER_1;
                    case 2:
                        System.out.println("The computer is Paper. You are Rock. You lose");
                        break OUTER_1;
                    default:
                        break;
                }
            case 2:
                switch (C) {
                    case 0:
                        System.out.println("The computer is Scissor. You are Paper. You lose");
                        break OUTER_2;
                    case 1:
                        System.out.println("The computer is Rock. You are Paper. You win");
                        break OUTER_2;
                    case 2:
                        System.out.println("The computer is Paper. You are Paper.It's a Draw");
                        break OUTER_2;
                    default:
                        break;
                }
        }

    }
}

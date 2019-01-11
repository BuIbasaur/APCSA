package Chapter04;

//Max Tesch// 
import java.util.Scanner;

/**
 * sorts students by there classes and grade
 *
 * @author Max Tesch
 */
public class C4_1 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String A = input.next();

        if ((A.charAt(0) == 'M' || A.charAt(0) == 'I' || A.charAt(0) == 'C') && (A.charAt(1) == '1' || A.charAt(1) == '2' || A.charAt(1) == '3' || A.charAt(1) == '4')) {
            switch (A.charAt(0)) {
                case 'M':
                    System.out.print("Mathematics ");
                    break;
                case 'C':
                    System.out.print("Computer Science ");
                    break;
                case 'I':
                    System.out.print("Information Technology");
                    break;
                default:
                    break;
            }
            switch (A.charAt(1)) {
                case '1':
                    System.out.print("Freshman");
                    break;
                case '2':
                    System.out.print("Sophmore");
                    break;
                case '3':
                    System.out.print("Junior");
                    break;
                case '4':
                    System.out.print("Senior");
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Invaild input");
        }

    }
}

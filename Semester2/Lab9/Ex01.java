import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");

                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                // display result
                System.out.println("The sum is " + (n1 + n2));

                checkInput = false;

            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" + "Incorrect input: two integers are required) ");
                sc.nextLine(); // Discard input
            }

        } while (checkInput);

        sc.close();
    }
}
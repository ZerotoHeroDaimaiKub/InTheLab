package Lecture07;

import java.util.*;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.print(" What is " + number1 + " + " + number2 + "? ");
        int anwser = input.nextInt();

        while (number1 + number2 != anwser) {
            System.out.println("Wrong anwser. Try again. What is " + number1 + " + " + number2 +
                    "? ");
            anwser = input.nextInt();
        }

        System.out.println("You got it !");

    }
}

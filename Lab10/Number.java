package Lab10;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine(); // Read the input as a string

        printAsciiNumber(input);

        scanner.close();
    }

    public static void printAsciiNumber(String numStr) {
        // Loop through each character in the input number
        for (int i = 0; i < numStr.length(); i++) {
            char digitChar = numStr.charAt(i);
            if (digitChar == '0') {
                printDigit0();
            } else if (digitChar == '1') {
                printDigit1();
            } else if (digitChar == '2') {
                printDigit2();
            } else if (digitChar == '3') {
                printDigit3();
            } else if (digitChar == '4') {
                printDigit4();
            } else if (digitChar == '5') {
                printDigit5();
            } else if (digitChar == '6') {
                printDigit6();
            } else if (digitChar == '7') {
                printDigit7();
            } else if (digitChar == '8') {
                printDigit8();
            } else if (digitChar == '9') {
                printDigit9();
            }

            if (i < numStr.length() - 1) {
                System.out.println(); // Move to the next line for the next digit
            }
        }
    }

    public static void printDigit0() {
        // Define ASCII art for digit 0
        System.out.println(" 0000 ");
        System.out.println("00  00");
        System.out.println("00  00");
        System.out.println("00  00");
        System.out.println(" 0000 ");
    }

    public static void printDigit1() {
        // Define ASCII art for digit 1
        System.out.println("1111  ");
        System.out.println("  11  ");
        System.out.println("  11  ");
        System.out.println("  11  ");
        System.out.println("  11  ");
    }

    public static void printDigit2() {
        // Define ASCII art for digit 2
        System.out.println("222222 ");
        System.out.println("   22");
        System.out.println("  22 ");
        System.out.println(" 22  ");
        System.out.println("222222");
    }

    public static void printDigit3() {
        // Define ASCII art for digit 3
        System.out.println("333333 ");
        System.out.println("    33 ");
        System.out.println(" 33333 ");
        System.out.println("    33 ");
        System.out.println("333333 ");
    }

    public static void printDigit4() {
        // Define ASCII art for digit 4
        System.out.println("44  44");
        System.out.println("44  44");
        System.out.println("444444");
        System.out.println("    44");
        System.out.println("    44");
    }

    public static void printDigit5() {
        // Define ASCII art for digit 5
        System.out.println("5555555");
        System.out.println("55    ");
        System.out.println("5555555");
        System.out.println("     55");
        System.out.println("5555555");
    }

    public static void printDigit6() {
        // Define ASCII art for digit 6
        System.out.println("666666 ");
        System.out.println("66    ");
        System.out.println("666666 ");
        System.out.println("66  66");
        System.out.println("666666 ");
    }

    public static void printDigit7() {
        // Define ASCII art for digit 7
        System.out.println("777777");
        System.out.println("    77 ");
        System.out.println("    77  ");
        System.out.println("    77   ");
        System.out.println("    77    ");
    }

    public static void printDigit8() {
        // Define ASCII art for digit 8
        System.out.println("888888 ");
        System.out.println("88  88");
        System.out.println("888888 ");
        System.out.println("88  88");
        System.out.println("888888 ");
    }

    public static void printDigit9() {
        // Define ASCII art for digit 9
        System.out.println("999999 ");
        System.out.println("99  99");
        System.out.println("999999");
        System.out.println("    99");
        System.out.println("999999 ");
    }

}

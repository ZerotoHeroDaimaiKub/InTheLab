package Lab9;

import java.util.*;

public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int x = 9;
        int y = 7;

        int k = max(i, j); // Invoke method
        int newMax = max(i, j, x, y);
        // System.out.println("The maximum between " + i + " and " + j + " is " + k);
        System.out.println("The maximum between " + i + ", " + j + ", " + x + " and " + y + " is " + newMax);
    }

    /* Return the max between two numbers */
    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    public static int max(int num1, int num2, int num3, int num4) {
        int result;

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            result = num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            result = num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            result = num3;
        } else {
            result = num4;
        }

        return result;
    }

}

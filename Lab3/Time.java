package Lab3;

import java.util.*;

public class Time {
    public static void main(String[] args) {
        /*
         * Read times (second)
         * Convert -> day, hour, min, sec
         * 
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int totalSeconds = input.nextInt();

        int days = totalSeconds / (24 * 3600);
        totalSeconds = totalSeconds % (24 * 3600);

        int hours = totalSeconds / 3600;
        totalSeconds = totalSeconds % 3600;

        int minutes = totalSeconds / 60;

        int seconds = totalSeconds % 60;

        System.out.println("Converted time: " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds
                + " seconds.");

    }
}

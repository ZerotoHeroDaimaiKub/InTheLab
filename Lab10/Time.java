package Lab10;

import java.util.*;

public class Time {
    public static String convertMillis(long millis) {
        // Calculate total seconds
        long totalSeconds = millis / 1000;

        // Calculate seconds
        long seconds = totalSeconds % 60;

        // Calculate total minutes
        long totalMinutes = totalSeconds / 60;

        // Calculate minutes
        long minutes = totalMinutes % 60;

        // Calculate hours
        long hours = totalMinutes / 60;

        // Create a formatted string for the result
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in milliseconds: ");

        long number = scanner.nextLong();

        String formattedTime = convertMillis(number);

        System.out.println(formattedTime);

        scanner.close();
    }
}

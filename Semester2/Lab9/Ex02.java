import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Invoke getArray method
        int[] array = getArray();

        while (true) {
            System.out.print("Please enter index of array (0-99): ");
            int index = sc.nextInt();
            if (index >= 0 && index <= 99) {
                System.out.println("The value at index " + index + " is " + array[index]);
                System.out.println("End nicely");
                System.out.println("Continuing processing...");
            } else {
                System.out.println("You referred to an index that does not exist");
                System.out.println("Continuing processing...");
            }
        }

        /*
         * System.out.print("Please enter index of array(0-99) : ");
         * try {
         * // display array index
         * System.out.println("The value at index is " + array[sc.nextInt()]);
         * } catch (ArrayIndexOutOfBoundsException ex) {
         * System.out.println("Out of Bounds");
         * }
         */
    }

    // return array with 100 randomly int
    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}

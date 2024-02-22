import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int points = a + b + c;

        if (points >= 80)
            System.out.println("A");
        else if (points >= 75 && points < 80)
            System.out.println("B+");
        else if (points >= 70 && points < 75)
            System.out.println("B");
        else if (points >= 65 && points < 70)
            System.out.println("C+");
        else if (points >= 60 && points < 65)
            System.out.println("C");
        else if (points >= 55 && points < 60)
            System.out.println("D+");
        else if (points >= 50 && points < 55)
            System.out.println("D");
        else if (points >= 0 && points < 50)
            System.out.println("F");

    }
}

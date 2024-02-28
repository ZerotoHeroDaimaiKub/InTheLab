import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student's age: ");
            int age = scanner.nextInt();
            registerStudent(age);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }

    public static void registerStudent(int age) throws InvalidInputException {
        if (age < 0 || age > 100) {
            throw new InvalidInputException("Age must be between 0 and 100.");
        }
        System.out.println("Student registered successfully with age: " + age);
    }
}

package Lab12;

public class Grade {
    public static void main(String[] args) {
        char[][] answers = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }
        };

        char[] correctAnswers = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

        for (int student = 0; student < answers.length; student++) {
            int correctCount = 0;

            for (int question = 0; question < answers[student].length; question++) {
                if (answers[student][question] == correctAnswers[question]) {
                    correctCount++;
                }
            }

            System.out.println("Student " + student + "'s correct count is " + correctCount);
        }
    }
}

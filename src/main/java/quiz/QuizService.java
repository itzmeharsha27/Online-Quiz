package quiz;


import java.util.Scanner;

public class QuizService {

    Question[] questions;
    int score = 0;

    public QuizService(Question[] questions) {
        this.questions = questions;
    }

    public void startQuiz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];

            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            System.out.print("Enter your answer: ");
            int userAnswer = sc.nextInt();

            if (userAnswer == q.correctAnswer) {
                score++;
            }
        }
    }

    public int getScore() {
        return score;
    }
}

package quiz;

public class Main {

    public static void main(String[] args) {

        Question[] questions = new Question[3];

        questions[0] = new Question(
                "What is Java?",
                new String[]{"OS", "Programming Language", "Browser", "Database"},
                2
        );

        questions[1] = new Question(
                "Which keyword is used to create object?",
                new String[]{"class", "this", "new", "static"},
                3
        );

        questions[2] = new Question(
                "Which concept allows multiple methods with same name?",
                new String[]{"Inheritance", "Encapsulation", "Polymorphism", "Abstraction"},
                3
        );

        QuizService quiz = new QuizService(questions);
        quiz.startQuiz();

        Result.showResult(quiz.getScore(), questions.length);
    }
}

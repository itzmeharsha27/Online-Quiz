package quiz;

public class Result {

    public static void showResult(int score, int total) {
        System.out.println("\n===== RESULT =====");
        System.out.println("Score: " + score + "/" + total);

        if (score >= total / 2) {
            System.out.println("Status: PASS ✅");
        } else {
            System.out.println("Status: FAIL ❌");
        }
    }
}

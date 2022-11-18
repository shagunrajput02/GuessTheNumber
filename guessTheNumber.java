import java.util.Scanner;

public class game {
    public static void guessingGame() {
        Scanner sn = new Scanner(System.in);
        int n = 1 + (int) (100 * Math.random());
        int K = 7,i;
        System.out.println("The number is chosen between 1 to 100.");
        System.out.println("Try to guess the number within 7 trials to win this game.");
        for (i = 0; i < K; i++) {
            System.out.println("Guess the number: ");
            int g = sn.nextInt();
            if (n == g) {
                System.out.println("The number is right. Congratulations. YOU WON");
                break;
            } else if (n > g && i != K - 1) {
                System.out.println("The number is greater than " + g);
            } else if (n < g && i != K - 1) {
                System.out.println("The number is less than " + g);
            }
        }
            if (i == K) {
                System.out.print("You have exhausted" + K + "trials.");
                System.out.println("The random number was " + n);
            }

        }
    public static void main(String[] args) {
        guessingGame();
    }
}

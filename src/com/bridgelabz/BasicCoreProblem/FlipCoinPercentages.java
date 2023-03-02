import java.util.Random;
import java.util.Scanner;

public class FlipCoinPercentages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Number of flips should be a positive integer.");
        } else {
            int heads = 0;
            int tails = 0;
            Random random = new Random();

            for (int i = 0; i < n; i++) {
                double result = random.nextDouble();
                if (result < 0.5) {
                    tails++;
                } else {
                    heads++;
                }
            }

            double percentageHeads = heads * 100.0 / n;
            double percentageTails = tails * 100.0 / n;
            System.out.printf("Percentage of heads: %.2f%%\n", percentageHeads);
            System.out.printf("Percentage of tails: %.2f%%\n", percentageTails);
        }
    }
}

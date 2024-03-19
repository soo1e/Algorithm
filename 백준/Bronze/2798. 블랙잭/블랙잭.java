import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();

        int closestSum = 0;
        int minDiff = Integer.MAX_VALUE;

        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }

        Arrays.sort(cards);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = cards[i] + cards[left] + cards[right];
                int diff = Math.abs(currentSum - M);

                if (diff == 0) { // Found exact match
                    closestSum = currentSum;
                    break;
                }

                if (diff < minDiff && currentSum <= M) {
                    minDiff = diff;
                    closestSum = currentSum;
                }

                if (currentSum < M) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println(closestSum);

        scanner.close();
    }
}
    
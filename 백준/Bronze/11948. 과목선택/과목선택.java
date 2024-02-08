import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[4];
        int[] arr2 = new int[2];


        int min1 = 100;
        int sum1 = 0;

        int min2 = 100;
        int sum2 = 0;

        for (int i = 0; i < 4; i++) {
            int A = scanner.nextInt();
            arr1[i] = A;

            if (A < min1) {
                min1 = A;
            }

            sum1 = sum1 + A;
        }

        for (int i = 0; i < 2; i++) {
            int A = scanner.nextInt();
            arr2[i] = A;

            if (A < min2) {
                min2 = A;
            }

            sum2 = sum2 + A;
        }
        System.out.println((sum1-min1) + (sum2 - min2));
    }
}

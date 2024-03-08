import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int[] arr = {A,B,C};
            Arrays.sort(arr);
            int sum = 0;
            if (A == B && B == C) {
                sum = 10000 + (A)*1000;
            } else if (A == B || B == C || C == A) {
                sum = 1000 + arr[1] * 100;
            } else {
                sum = arr[2] * 100;
            }
            if (sum > max) max = sum;
        }
        System.out.println(max);
    }
}
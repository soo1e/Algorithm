import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int sum = 0;

            if (A == 1) {
                sum = sum + 5000000;
            } else if (A > 1 && A <= 3) {
                sum = sum + 3000000;
            } else if (A >= 4 && A <= 6) {
                sum = sum + 2000000;
            } else if (A > 6 && A <= 10) {
                sum = sum + 500000;
            } else if (A >= 11 && A <= 15) {
                sum = sum + 300000;
            } else if (A >= 16 && A <= 21) {
                sum = sum + 100000;
            } else {
                sum = sum;
            }

            if (B == 1) {
                sum = sum + 5120000;
            } else if (B > 1 && B <= 3) {
                sum = sum + 2560000;
            } else if (B >= 4 && B <= 7) {
                sum = sum + 1280000;
            } else if (B >= 8 && B <= 15) {
                sum = sum + 640000;
            } else if (B >= 16 && B <= 31) {
                sum = sum + 320000;
            } else {
                sum = sum;
            }

            System.out.println(sum);
        }
    }
}

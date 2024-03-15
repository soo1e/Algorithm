import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int sumY = 0;
            int sumK = 0;
            for (int j = 0; j < 9; j++) {
                int Y = scanner.nextInt();
                int K = scanner.nextInt();
                sumY = sumY + Y;
                sumK = sumK + K;
            }

            if (sumY > sumK) {
                System.out.println("Yonsei");
            } else if (sumY < sumK) {
                System.out.println("Korea");
            } else if (sumY == sumK) {
                System.out.println("Draw");
            }
        }
    }
}

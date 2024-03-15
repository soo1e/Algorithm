import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int sum = 0;
            double HJ = 0;
            double final_HJ = 0;
            for (int j = 0; j < N; j++) {
                int A = scanner.nextInt();
                double B = scanner.nextDouble();
                sum = sum + A;
                HJ = HJ + (A * B);
            }
            final_HJ = HJ / sum;
            System.out.println(sum + " " + String.format("%.1f", final_HJ));
        }
    }
}

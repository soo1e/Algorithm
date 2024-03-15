import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int s = scanner.nextInt();
            int sum = 0;
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                sum = sum + a * b;
            }
            System.out.println(s + sum);
        }
    }
}

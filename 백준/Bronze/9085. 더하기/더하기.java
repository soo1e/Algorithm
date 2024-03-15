import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i <T; i++) {
            int sum = 0;
            int N = scanner.nextInt();
            for (int j = 0; j < N; j++) {
                int A = scanner.nextInt();
                sum = sum + A;
            }
            System.out.println(sum);
        }
    }
}

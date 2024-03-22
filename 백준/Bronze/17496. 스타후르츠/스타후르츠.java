import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int C = scanner.nextInt();
        int P = scanner.nextInt();

        int sum = 0;

        int a = N/T;
        if (N % T == 0) {
            a = a - 1;
        }
        sum = a * C * P;
        System.out.println(sum);
    }
}
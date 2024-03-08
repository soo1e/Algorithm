import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            sum = sum - 1 + A;
        }
        System.out.println(sum + 1);
    }
}

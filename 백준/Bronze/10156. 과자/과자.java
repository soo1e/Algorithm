import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int sum = K * N;
        if (M < sum) {
            System.out.println(sum - M);
        } else {
            System.out.println(0);
        }
    }
}

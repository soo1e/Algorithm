import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            int A = scanner.nextInt();
            N = N - A;
        }

        System.out.println(N);
    }
}
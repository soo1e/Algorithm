import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        for (int i = 0; i < A; i++) {
            int C = scanner.nextInt();
            int Q = 0;
            int D = 0;
            int N = 0;
            int P = 0;

            Q = (C / 25);
            D = (C%25)/10;
            N = (C%25) % 10 / 5;
            P = (C%5);

            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}

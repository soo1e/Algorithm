import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int P = scanner.nextInt();

        int X = A * P;
        int Y = 0;
        if (P >= C) {
            Y = B + (D * (P-C));
        } else {
            Y = B;
        }

        if (X > Y) {
            System.out.println(Y);
        } else {
            System.out.println(X);
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int D = scanner.nextInt();

        C = C + D;

        B = B + (C/60);
        C = C % 60;

        A = A + (B/60);
        B = B%60;
        A = A%24;

        System.out.print(A + " ");
        System.out.print(B + " ");
        System.out.print(C);

    }
}

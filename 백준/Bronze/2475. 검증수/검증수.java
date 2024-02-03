import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        int F = (int)((Math.pow(A,2.0) + Math.pow(B,2.0) + Math.pow(C,2.0) + Math.pow(D,2.0) + Math.pow(E,2.0)) % 10);
        System.out.println(F);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double pi = Math.PI;

        double A = N * N * pi;
        double B = (N - 0) * (N - 0) + (N -0) * (N - 0);

        System.out.printf("%.6f",A);
        System.out.println();
        System.out.printf("%.6f",B);
    }
}

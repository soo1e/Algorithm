import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int C = (B % 10) * A;
        int D = (((B%100) - (B % 10))/10) * A;
        int E = (B / 100) * A;

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);

        System.out.println(A * B);

    }
}

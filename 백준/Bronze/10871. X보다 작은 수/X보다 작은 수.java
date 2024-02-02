import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        int X = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            A[i] = a;
            if ( X > a) {
                System.out.println(a);
            }
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int D = (int)Math.sqrt(W * W + H * H);

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            if (A <= D) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}

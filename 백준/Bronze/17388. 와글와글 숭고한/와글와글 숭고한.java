import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int K = scanner.nextInt();
        int H = scanner.nextInt();

        if (S + K + H >= 100) {
            System.out.println("OK");
        } else {
            int min = Math.min(S, Math.min(K, H));
            if (S == min) {
                System.out.println("Soongsil");
            }
            if (K == min) {
                System.out.println("Korea");
            }
            if (H == min) {
                System.out.println("Hanyang");
            }
        }
    }
}

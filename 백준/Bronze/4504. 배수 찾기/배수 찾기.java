import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (true) {
            int A = scanner.nextInt();
            if (A == 0) {
                break;
            }
            if (A % N == 0) {
                System.out.println(A + " is a multiple of " + N + ".");
            } else {
                System.out.println(A + " is NOT a multiple of " + N + ".");
            }
        }
    }
}
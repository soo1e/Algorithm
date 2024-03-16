import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int c = scanner.nextInt();
            int v = scanner.nextInt();
            int share = c / v;
            int remainder = c % v;
            System.out.println("You get " + share + " piece(s) and your dad gets " + remainder + " piece(s).");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int revA = (((A%100) % 10) * 100) + (((A/10) % 10) * 10) + (A / 100);
        int revB = (((B%100) % 10) * 100) + (((B/10) % 10) * 10) + (B / 100);

        if (revA > revB) {
            System.out.println(revA);
        } else {
            System.out.println(revB);
        }
    }
}
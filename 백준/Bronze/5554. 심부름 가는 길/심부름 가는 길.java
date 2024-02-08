import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int sum = A + B + C + D;

        int x = (sum / 60);
        int y = (sum % 60);
        System.out.println(x);
        System.out.println(y);
    }
}

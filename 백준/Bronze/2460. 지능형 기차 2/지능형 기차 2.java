import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            sum = sum - A;
            sum = sum + B;
            if (sum > max) max = sum;
        }
        System.out.println(max);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 4; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            sum = sum + (B - A);
            if(sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int diff = scanner.nextInt();

        if ((sum + diff) % 2 != 0 || sum < diff) {
            // 합과 차가 둘 다 짝수가 아니거나, 합이 차보다 작은 경우
            System.out.println(-1);
            return;
        }

        int A = (sum + diff) / 2;
        int B = sum - A;

        if (A < 0 || B < 0) {
            // A나 B가 음수인 경우
            System.out.println(-1);
        } else {
            System.out.print(A + " " + B);
        }
    }
}
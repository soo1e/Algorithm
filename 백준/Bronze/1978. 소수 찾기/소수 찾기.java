import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            if (isPrime(A)) {
                sum++;
            }
        }

        System.out.println(sum);
    }

    // 소수 판별 메서드
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


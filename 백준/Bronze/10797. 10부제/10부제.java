import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int A = scanner.nextInt();
            arr[i] = A;
            if (arr[i] == N) {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 2 3 4 5
        // 2 1 3 4 5
        // 2 1 4 3 5
        // 3 1 4 2 5

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = (i+1);
        }

        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt(); // 1
            int B = scanner.nextInt(); // 2

            int temp = arr[B-1]; // a
            arr[B-1] = arr[A-1];
            arr[A-1] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];

        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}

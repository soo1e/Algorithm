import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int P = scanner.nextInt();

        int[] arr = new int[5];
        int[] ans = new int[5];
        for (int i = 0; i < 5; i++) {
            int A = scanner.nextInt();
            arr[i] = A ;
            ans[i] =  arr[i] - (L * P);
            System.out.print(ans[i] + " ");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] arr = new int[101];


        for (int i = 0; i < 3; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            for (int j = X; j < Y; j++) {
                arr[j]++;
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum = sum + A;
            } else if (arr[i] == 2) {
                sum = sum + B * 2;
            } else if (arr[i] == 3) {
                sum = sum + C * 3;
            }
        }
        System.out.println(sum);
    }
}

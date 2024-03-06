import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int[] arr = {A, B, C};
            Arrays.sort(arr);

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            if (arr[0] == arr[1] & arr[1] == arr[2] ) {
                System.out.println("Equilateral");
            } else if (arr[2] < arr[0] + arr[1] && (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0])) {
                System.out.println("Isosceles");
            } else if (arr[2] < arr[0] + arr[1]) {
                System.out.println("Scalene");
            } else {
                System.out.println("Invalid");
            }
            scanner.nextLine();
        }
    }
}
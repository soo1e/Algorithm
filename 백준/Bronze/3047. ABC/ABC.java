import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        scanner.nextLine();
        int[] arr = {A, B, C};
        Arrays.sort(arr);

        String str = scanner.nextLine();
        if (str.equals("ABC")) {
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        } else if (str.equals("ACB")) {
            System.out.println(arr[0] + " " + arr[2] + " " + arr[1]);
        } else if (str.equals("BAC")) {
            System.out.println(arr[1] + " " + arr[0] + " " + arr[2]);
        } else if (str.equals("BCA")) {
            System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
        } else if (str.equals("CAB")) {
            System.out.println(arr[2] + " " + arr[0] + " " + arr[1]);
        } else if (str.equals("CBA")) {
            System.out.println(arr[2] + " " + arr[1] + " " + arr[0]);
        }
    }

}
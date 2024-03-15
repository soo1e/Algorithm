import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int N = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                A = A + 1;
            } else if (arr[i] == 'B') {
                B = B + 1;
            }
        }
        if (A > B) {
            System.out.println("A");
        } else if (B > A) {
            System.out.println("B");
        } else if (A == B) {
            System.out.println("Tie");
        }
    }
}

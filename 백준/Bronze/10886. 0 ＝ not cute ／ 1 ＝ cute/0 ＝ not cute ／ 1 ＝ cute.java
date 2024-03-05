import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zeroCount = 0;
        int oneCount = 0;
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            if (A == 1) {
                oneCount++;
            } else {
                zeroCount++;
            }
        }
        if (zeroCount>oneCount) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
}

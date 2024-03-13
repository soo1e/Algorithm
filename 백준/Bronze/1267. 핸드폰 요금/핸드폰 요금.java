import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int MS = 0;
        int YS = 0;

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            if (A % 30 != 0) {
                YS = YS + 10 * (A / 30) + 10;
            } else {
                YS = YS + 10 * (A / 30) + 10;
            }

            if (A % 60 != 0) {
                MS = MS + 15 * (A / 60) + 15;
            } else {
                MS = MS + 15 * (A / 60) + 15;
            }
        }
        if (YS > MS) {
            System.out.print("M " + MS);
        } else if (YS < MS) {
            System.out.println("Y " + YS);
        } else {
            System.out.print("Y " + "M " + MS);
        }
    }
}

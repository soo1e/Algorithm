import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = 0, B = 0, C = 0;

        if (N % 10 != 0 || N == 0) {
            System.out.println("-1");
        } else {
            A = N / 300;
            B = (N % 300) / 60;
            C = (N % 60) / 10;
            System.out.println(A + " " + B + " " + C);
        }
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger avg = new BigInteger("0");
        for (int i = 0; i < 3; i++) {
            BigInteger sum = new BigInteger("0");
            int N = scanner.nextInt();
            for (int j = 0; j < N; j++) {
                BigInteger B1 = scanner.nextBigInteger();
                sum = sum.add(B1);
            }
            if (sum.compareTo(avg) > 0) {
                System.out.println("+");
            } else if (sum.compareTo(avg) < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}

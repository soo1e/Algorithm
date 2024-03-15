import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BigInteger bigNum2 = new BigInteger("2");
        for (int i = 0; i < N; i++) {
            BigInteger bigNum1 = scanner.nextBigInteger();
            BigInteger remainder_bigNum = bigNum1.remainder(bigNum2);
            int int_bigNum = remainder_bigNum.intValue();
            if (int_bigNum == 0 ) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}


import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = new BigInteger(String.valueOf(scanner.nextBigInteger()));
        String B = scanner.next();
        BigInteger C = new BigInteger(String.valueOf(scanner.nextBigInteger()));

        BigInteger answer = new BigInteger("0");
        if (B.equals("+")) {
            answer = A.add(C);
        } else {
            answer = A.multiply(C);
        }

        System.out.println(answer);
    }
}

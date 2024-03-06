import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();

        String str1 = String.valueOf(A) + String.valueOf(B);
        String str2 = String.valueOf(C) + String.valueOf(D);

        long num1 = Long.parseLong(str1);
        long num2 = Long.parseLong(str2);
        
        System.out.println(num1 + num2);

    }
}

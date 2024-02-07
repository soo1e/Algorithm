import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B + C != 180) {
            System.out.println("Error");
        } else if (A == B && B == C) {
            System.out.println("Equilateral");
        } else if (A == B || B == C || C == A) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}

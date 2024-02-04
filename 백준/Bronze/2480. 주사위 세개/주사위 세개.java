import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int Max = 0 ;
        if ( A > Max ) {
            Max = A;
        }

        if ( B > Max ) {
            Max = B;
        }

        if ( C > Max ) {
            Max = C;
        }


        if ( A == B && B == C && C == A  ) {
            System.out.println(10000 + (A * 1000));
        } else if ( A == B || B == C ) {
            System.out.println(1000 + ( 100 * B ) );
        } else if ( C == A ) {
            System.out.println(1000 + ( 100 * A));
        } else {
            System.out.println((Max) * 100);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if ( H == 0  && M < 45) {
            H = 23;
            M = M + 60 ;

            System.out.print(H + " " + (M - 45));
        } else if (M < 45) {
            M = M + 60;
            H = H - 1;

            System.out.print(H + " " + (M - 45));
        } else {
            System.out.print(H + " " + (M - 45));
        }

    }
}

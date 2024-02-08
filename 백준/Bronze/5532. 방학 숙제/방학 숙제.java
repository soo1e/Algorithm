import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        double AC = A/ (double) C;
        double BD = B/ (double) D;
        
        int ceilAC = (int) Math.ceil(AC);
        int ceilBD = (int) Math.ceil(BD);


        if (ceilAC < ceilBD) {
            System.out.println(L - ceilBD);
        } else {
            System.out.println(L - ceilAC);
        }
    }
}

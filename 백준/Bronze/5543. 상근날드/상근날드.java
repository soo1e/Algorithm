import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] burgerArray = new int[3];
        int burgerMin = 2000;

        int[] beverageArray = new int[2];
        int beverageMin = 2000;

        for (int i = 0; i < burgerArray.length; i++) {
            int A = scanner.nextInt();
            if (burgerMin > A) {
                burgerMin = A;
            }
        }

        for (int i = 0; i < beverageArray.length; i++) {
            int B = scanner.nextInt();
            if (beverageMin > B) {
                beverageMin = B;
            }
        }

        System.out.println(burgerMin + beverageMin - 50);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 8 == 1) {
            System.out.println(1);
        }

        if (N % 8 == 2 || N % 8 == 0) {
            System.out.println(2);
        }

        if (N % 8 == 3 || N % 8 == 7) {
            System.out.println(3);
        }
        
        if (N % 8 == 4 || N % 8 == 6) {
            System.out.println(4);
        }
        
        if (N % 8 == 5) {
            System.out.println(5);
        }
    }
}
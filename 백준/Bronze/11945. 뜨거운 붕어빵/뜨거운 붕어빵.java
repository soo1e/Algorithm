import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if (M>0) {
            for (int i = 0; i < N; i++) {
                char[] text = scanner.next().toCharArray();
                for (int j = M-1; j>=0; j--) {
                    System.out.print(text[j]);
                }
                System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            if (str.contains("FBI")) {
                sum = sum + 1;
                System.out.print(i + 1 + " ");
            }
        }

        if (sum == 0) {
            System.out.println("HE GOT AWAY!");
        }
    }
}

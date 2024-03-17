import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String str = scanner.nextLine();
            int count = 0;
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                char[] charArr = str.toCharArray();
                if (charArr[j] == 'O') {
                    count++;
                    sum = sum + count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}

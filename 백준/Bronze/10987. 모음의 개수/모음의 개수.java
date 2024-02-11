import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // 문자열의 각 문자에 접근
            // 문자가 모음인지 확인
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sum += 1;
            }
        }

        System.out.println(sum);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자를 처리하기 위해 추가

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            if (!str.isEmpty()) { // 입력된 문자열이 비어있지 않은 경우에만 처리
                char[] charArr = str.toCharArray();
                char c0 = charArr[0];
                c0 = Character.toUpperCase(c0);
                charArr[0] = c0; // 첫 글자를 대문자로 변경
                str = new String(charArr);
            }
            System.out.println(str);
        }
    }
}


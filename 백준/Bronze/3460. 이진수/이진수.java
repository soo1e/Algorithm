
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            // 이진수로 변환된 문자열을 저장
            String binaryString = Integer.toBinaryString(n);

            // 이진수의 문자열을 반대로 순회하여 1의 위치를 출력
            for (int j = binaryString.length() - 1; j >= 0; j--) {
                if (binaryString.charAt(j) == '1') {
                    System.out.print(binaryString.length() - j - 1 + " ");
                }
            }
            System.out.println();
        }
    }
}
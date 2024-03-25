import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        scanner.close();

        if (B >= C) {
            System.out.println("-1"); // 손익분기점을 넘지 못하는 경우
            return;
        }

        long X = A / (C - B) + 1; // 손익분기점 공식

        System.out.println(X);
    }
}

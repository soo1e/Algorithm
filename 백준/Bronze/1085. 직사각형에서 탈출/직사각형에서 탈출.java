
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int distanceToLeft = x; // 왼쪽 변까지
        int distanceToBottom = y; // 아래쪽 변까지
        int distanceToRight = w - x; // 오른쪽 변까지
        int distanceToTop = h - y; // 위쪽 변까지

        int minDistance = Math.min(Math.min(distanceToLeft, distanceToBottom),
                Math.min(distanceToRight, distanceToTop));

        System.out.println(minDistance);
    }
}

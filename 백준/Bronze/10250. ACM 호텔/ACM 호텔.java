import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt(); // 층 수
            int W = scanner.nextInt(); // 방 수 (사용하지 않음)
            int N = scanner.nextInt(); // 몇 번째 손님

            int floor = N % H;
            int room = N / H + 1;
            if (floor == 0) { // N이 H의 배수일 경우
                floor = H;
                room = N / H; // N이 H의 배수이므로, 방 번호를 1 증가시키지 않음
            }

            System.out.printf("%d%02d\n", floor, room);
        }
    }
    }
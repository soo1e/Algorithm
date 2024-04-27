import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 바구니의 개수 N과 바구니 순서 변경 횟수 M 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 바구니 배열 생성 및 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // 바구니 순서 변경
        for (int m = 0; m < M; m++) {
            int start = scanner.nextInt(); // 시작 인덱스
            int end = scanner.nextInt();   // 끝 인덱스

            // 시작부터 끝까지의 바구니 순서를 역순으로 변경
            reverseBaskets(baskets, start - 1, end - 1);
        }

        // 결과 출력
        for (int basket : baskets) {
            System.out.print(basket + " ");
        }

        scanner.close();
    }

    // 배열의 특정 범위를 역순으로 변경하는 메소드
    private static void reverseBaskets(int[] baskets, int start, int end) {
        while (start < end) {
            int temp = baskets[start];
            baskets[start] = baskets[end];
            baskets[end] = temp;
            start++;
            end--;
        }
    }
}

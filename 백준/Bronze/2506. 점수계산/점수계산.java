import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        int bonus = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 1) { // 정답인 경우
                bonus++; // 가산점 증가
                sum += bonus; // 총 점수에 가산점을 더함
            } else {
                bonus = 0; // 틀린 경우 가산점 초기화
            }
        }

        System.out.println(sum);
    }
}


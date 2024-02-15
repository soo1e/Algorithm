import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); // 현재 시간 (시)
        int B = scanner.nextInt(); // 현재 시간 (분)
        int C = scanner.nextInt(); // 추가할 시간 (분)

        B = B + C; // 분을 추가함
        A = A + B / 60; // 추가된 분으로 인한 시간 증가
        B = B % 60; // 60으로 나눈 나머지가 최종 분

        if (A >= 24) { // 시간이 24시를 넘어가면 24로 나눈 나머지로 조정
            A = A % 24;
        }

        System.out.println(A + " " + B);
    }
}

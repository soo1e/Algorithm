import java.util.Scanner;

// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        if ( 90 <= result) {
            System.out.println("A");
        } else if (result >= 80 && result <= 89) {
            System.out.println("B");
        } else if (result >= 70 && result <= 79) {
            System.out.println("C");
        } else if (result >= 60 && result <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

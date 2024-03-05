
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // (창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수) / (앨범에 수록된 곡의 개수)
        // X / A = I
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int I = scanner.nextInt()-1;
        int X = I * A;
        System.out.println(X+1);
    }
}
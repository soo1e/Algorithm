import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int sum = A * B * C;
        String strNum = Integer.toString(sum);
        int[] a = new int[10];
        int[] arrNum = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            arrNum[i] = strNum.charAt(i) - '0';
        }
        for (int i = 0; i < arrNum.length; i++) {
            int Z = arrNum[i];
            a[Z]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}

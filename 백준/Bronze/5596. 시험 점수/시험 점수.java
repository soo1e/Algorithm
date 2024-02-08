import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] MK = new int[4];
        int[] MS = new int[4];

        int MK_sum = 0;
        int MS_sum = 0;

        for (int i = 0; i < MK.length; i++) {
            int N = scanner.nextInt();
            MK_sum = MK_sum + N;
        }

        for (int i = 0; i < MS.length; i++) {
            int M = scanner.nextInt();
            MS_sum = MS_sum + M;
        }

        if (MK_sum > MS_sum) {
            System.out.println(MK_sum);
        } else {
            System.out.println(MS_sum);
        }
    }
}

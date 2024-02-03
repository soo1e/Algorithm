import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int same = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            array[i] = X;
        }

        int Y = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if ( Y == array[i]) {
                same = same + 1;
            }
        }
        System.out.println(same);
    }
}

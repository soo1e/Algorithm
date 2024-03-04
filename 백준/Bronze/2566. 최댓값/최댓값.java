import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;
        int maxi = 0;
        int maxj = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr [i][j] = scanner.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }

        System.out.println(max);
        System.out.print((maxi+1) + " " + (maxj+1));


    }
}

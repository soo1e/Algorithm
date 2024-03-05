import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int max = 0;
        int team = 0;
        for (int i = 0; i < 5; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
            arr[i][3] = scanner.nextInt();
            arr[i][4] = arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
            if (max < arr[i][4]) {
                max = arr[i][4];
                team = i+1;
            }
        }
        System.out.print(team + " " + max);
    }
}

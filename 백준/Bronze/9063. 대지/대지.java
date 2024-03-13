import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int arr2[] = {X, Y};
            if (X > maxX) {
                maxX = X;
            }
            if (Y > maxY) {
                maxY = Y;
            }
            if (X < minX) {
                minX = X;
            }
            if (Y < minY) {
                minY = Y;
            }
        }
        int finalX = maxX - minX;
        int finalY = maxY - minY;
        int area = finalX * finalY;
        System.out.println(area);
    }
}

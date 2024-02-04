import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int [][] matrix1 = new int[A][B];
        int [][] matrix2 = new int[A][B];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                matrix1 [i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                matrix2 [i][j] = scanner.nextInt();
            }
        }

        int [][] matrixSum = new int[A][B];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                matrixSum[i][j] = matrix1 [i][j] + matrix2 [i][j];
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

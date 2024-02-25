import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();

        int G = Integer.MAX_VALUE, H = Integer.MAX_VALUE;


        int[] arr1 = {A, C, E, G};
        int[] arr2 = {B, D, F, H};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1[0] != arr1[1]) {
            G = arr1[0];
        } else {
            G = arr1[2];
        }

        if (arr2[0] != arr2[1]) {
            H = arr2[0];
        } else {
            H = arr2[2];
        }

        System.out.println(G + " " + H);
    }
}

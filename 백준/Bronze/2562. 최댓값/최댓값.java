import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

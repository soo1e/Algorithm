import java.util.Scanner;

public class Main {
    // value -> index
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[26];
        char[] temp = scanner.next().toCharArray();

        for (int i = 0; i < temp.length; i++) {
            arr[temp[i]-97]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

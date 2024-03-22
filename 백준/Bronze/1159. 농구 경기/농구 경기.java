import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            char[] charArr = str.toCharArray();
            arr[charArr[0]-'a']++;
        }

        boolean printed = false;

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                System.out.print((char)(i+'a'));
                printed = true;
            }
        }
        if(!printed) System.out.println("PREDAJA");
    }
}
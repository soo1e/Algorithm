import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        int[] intArray = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            intArray[charArray[i] - 'a']++;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}

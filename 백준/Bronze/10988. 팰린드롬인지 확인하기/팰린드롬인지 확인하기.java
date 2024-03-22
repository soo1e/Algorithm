import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();

        char[] charArr1 = str.toCharArray();
        char[] charArr2 = str.toCharArray();

        for (int i = 0; i < charArr1.length / 2; i++) {
            char temp = charArr2[i];
            charArr2[i] = charArr2[charArr2.length - i - 1];
            charArr2[charArr2.length - i - 1] = temp;
        }

        String reversedStr = new String(charArr2);
        if (str.equals(reversedStr)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

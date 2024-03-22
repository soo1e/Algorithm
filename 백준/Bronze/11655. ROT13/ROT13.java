
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        char[] charArr = S.toCharArray();
        char[] newCharArr = new char[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                newCharArr[i] = (char)(((c - base + 13) % 26) + base);
            } else {
                newCharArr[i] = c;
            }
        }
        System.out.println(new String(newCharArr));
    }
}

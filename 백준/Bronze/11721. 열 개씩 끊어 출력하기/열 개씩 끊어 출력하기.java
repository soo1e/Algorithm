import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(charArray[i]);
            if(i > 1 && i % 10 == 9) {
                System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("END")) {
                break;
            }

            char[] textArr = s.toCharArray();
            for (int i = textArr.length - 1; i >= 0 ; i--) {
                System.out.print(textArr[i]);
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0 ;
        String str = scanner.nextLine();
        char[] textArr = str.toCharArray();

        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i] == 'a' || textArr[i] == 'e' || textArr[i] == 'i' || textArr[i] == 'o' || textArr[i] == 'u') {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    }
}

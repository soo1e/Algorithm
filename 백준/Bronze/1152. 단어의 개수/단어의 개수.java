import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ' ') {
                sum = sum + 1;
            }
        }
        if (charArr[0] == ' ') {
            sum = sum - 1;
        }
        if (charArr[charArr.length-1] == ' ') {
            sum = sum - 1;
        }
        System.out.println(sum+1);
    }
}
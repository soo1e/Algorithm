import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("#")) {
                break;
            }
            char[] arr = s.toCharArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if( arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
                    arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                    sum = sum + 1;
                }
            }
            System.out.println(sum);

        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int sum = 0;
            String str = scanner.nextLine();
            if (str.equals("0")) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                String a = str.substring(i, i+1);

                if (a.equals("1")) {
                    sum = sum + 3;
                } else if (a.equals("0")) {
                    sum = sum + 5;
                } else {
                    sum = sum + 4;
                }
            }
            System.out.println(sum+1);
        }
    }
}
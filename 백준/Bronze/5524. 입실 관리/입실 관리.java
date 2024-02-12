import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] array = new String[N];
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextLine();
            String newword = array[i].toLowerCase();
            System.out.println(newword);
        }
    }
}

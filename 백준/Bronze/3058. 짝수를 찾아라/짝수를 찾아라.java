import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                int A = scanner.nextInt();
                if (A % 2 == 0) {
                    arrList.add(A);
                }
                arrList.sort(Comparator.naturalOrder());
                sum = arrList.stream().mapToInt(Integer::intValue).sum();
            }
            System.out.println(sum + " " + arrList.get(0));
        }
    }
}

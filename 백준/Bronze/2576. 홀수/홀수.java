import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> oddArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            int N = scanner.nextInt();
            if(N%2 == 1) {
                oddArray.add(N);
            }
        }
        int sum = 0;
        Collections.sort(oddArray);

        if (oddArray.size() == 0) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < oddArray.size(); i++) {
                sum = sum + oddArray.get(i);
            }
            System.out.println(sum);
            System.out.println(oddArray.get(0));
        }



    }
}

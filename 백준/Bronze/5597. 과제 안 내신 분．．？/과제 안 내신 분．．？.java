import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<Integer>();
        for (int i = 1; i <= 30; i++) {
            students.add(i);
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 28; i++) {
            int N = sc.nextInt();
            students.remove(Integer.valueOf(N));
        }

        System.out.println(students.get(0));
        System.out.println(students.get(1));

    }
}
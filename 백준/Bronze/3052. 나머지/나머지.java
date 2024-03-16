import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int A = scanner.nextInt();
            arr[i] = A % 42;
        }
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(integerArray));
        System.out.println(set.size());
    }
}
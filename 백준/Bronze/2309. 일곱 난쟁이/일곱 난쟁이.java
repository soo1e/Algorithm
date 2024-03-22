import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        List<Integer> new_arr = new ArrayList<>();
        int sum = 0;
        int lt_sum = 0;
        int idx_i = 0;
        int idx_j = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        outerloop:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                lt_sum = arr[i] + arr[j];
                if (sum - lt_sum == 100) {
                    idx_i = i;
                    idx_j = j;
                    break outerloop; // 내부 루프와 외부 루프 종료
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i == idx_i || i == idx_j) {
                continue;
            }
            new_arr.add(arr[i]);
        }
        Collections.sort(new_arr);
        for (int i = 0; i < 7; i++) {
            System.out.println(new_arr.get(i));
        }

    }
}

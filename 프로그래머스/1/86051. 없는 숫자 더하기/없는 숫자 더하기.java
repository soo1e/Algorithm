import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int all = 0;
        for (int i = 0; i <= 9; i++) {
            all = all + i;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return all - sum;
    }
}
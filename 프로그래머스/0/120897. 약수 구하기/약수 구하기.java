import java.util.*;

class Solution {
    public Integer[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        return arr.toArray(new Integer[arr.size()]);
    }
}

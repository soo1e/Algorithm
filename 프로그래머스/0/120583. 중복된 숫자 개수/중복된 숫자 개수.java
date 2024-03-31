import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int count = 0;
        boolean foundN = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
                foundN = true;
            } else if (foundN) {
                break;
            }
        }

        return count;
    }
}

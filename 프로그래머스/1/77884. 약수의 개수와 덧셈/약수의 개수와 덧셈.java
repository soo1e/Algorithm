class Solution {
    public int solution(int left, int right) {
        int total = 0;
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                total += i;
            } else {
                total -= i;
            }
        }
        return total;
    }
}

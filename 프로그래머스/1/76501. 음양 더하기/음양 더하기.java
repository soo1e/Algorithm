class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i<absolutes.length; i++) {
            int A = 0;
            if (signs[i] == true) {
                A = absolutes[i];
            } else {
                A = -absolutes[i];
            }
            sum = sum + A;
        }
        return sum;
    }
}


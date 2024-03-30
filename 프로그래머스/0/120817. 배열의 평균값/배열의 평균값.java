class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double num = (double) numbers.length;
        double answer = sum / num;
        return answer;
    }
}
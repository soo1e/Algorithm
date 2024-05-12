class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 1) { // 홀수 번째 원소
                oddSum += num_list[i];
            } else { // 짝수 번째 원소
                evenSum += num_list[i];
            }
        }
        
        // 두 합 중 큰 값을 선택하여 반환
        return Math.max(oddSum, evenSum);
    }
}

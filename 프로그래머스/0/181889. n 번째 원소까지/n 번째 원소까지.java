class Solution {
    public int[] solution(int[] num_list, int n) {
        // 주어진 num_list의 첫 번째 원소부터 n번째 원소까지를 담을 배열 생성
        int[] answer = new int[n];
        
        // 첫 번째 원소부터 n번째 원소까지를 복사
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}

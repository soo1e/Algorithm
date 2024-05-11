class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length]; // 새로운 배열 생성
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) { // 50보다 크거나 같은 짝수
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) { // 50보다 작은 홀수
                answer[i] = arr[i] * 2;
            } else { // 조건에 맞지 않는 경우
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}

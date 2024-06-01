class Solution {
    public int[] solution(int[] num_list) {
        // 새로운 값을 추가할 배열의 크기는 기존 배열의 크기 + 1
        int[] answer = new int[num_list.length + 1];
        
        // 기존 배열의 값을 새로운 배열로 복사
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        // 마지막 원소와 그전 원소 비교
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            // 마지막 원소가 그전 원소보다 크면 그 차이를 추가
            answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            // 그렇지 않으면 마지막 원소를 두 배한 값을 추가
            answer[answer.length - 1] = num_list[num_list.length - 1] * 2;
        }
        
        return answer;
    }
}

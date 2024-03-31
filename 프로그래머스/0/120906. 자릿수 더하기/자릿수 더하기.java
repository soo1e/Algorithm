class Solution {
    public int solution(int n) {
        int answer = 0;

        // 정수 n의 각 자리 숫자의 합 계산
        while (n > 0) {
            answer += n % 10; // 현재 자릿수의 숫자를 더합니다.
            n /= 10; // 다음 자릿수로 이동합니다.
        }

        return answer;
    }
}

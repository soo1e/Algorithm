class Solution {
    public int[] solution(long n) {
        // 입력된 숫자의 자릿수 계산
        int digitCount = (int)(Math.log10(n) + 1);
        
        // 자릿수만큼의 공간을 가지는 배열 선언
        int[] answer = new int[digitCount];
        
        // 숫자를 뒤집어서 answer 배열에 저장
        for (int i = 0; i < digitCount; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        
        return answer;
    }
}

class Solution {
    public boolean solution(int x) {
        int originalX = x; // 원래의 x를 보존하기 위해 변수에 저장
        int sum = 0;
        
        // 각 자릿수의 합 계산
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        
        // 원래의 x가 자릿수의 합으로 나누어 떨어지는지 확인
        return originalX % sum == 0;
    }
}

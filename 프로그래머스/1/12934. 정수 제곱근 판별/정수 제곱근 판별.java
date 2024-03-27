class Solution {
    public long solution(long n) {
        // n이 1 이상 50000000000000 이하인 양의 정수이므로, x의 최댓값은 50000000000000의 제곱근을 올림한 값입니다.
        long maxPossibleX = (long)Math.ceil(Math.sqrt(n));
        
        // 1부터 최댓값까지 반복하면서 n이 어떤 x의 제곱인지 확인
        for (long x = 1; x <= maxPossibleX; x++) {
            if (x * x == n) {
                // n이 x의 제곱이라면 (x+1)의 제곱을 반환
                return (x + 1) * (x + 1);
            }
        }
        
        // 양의 정수 x의 제곱이 아니면 -1을 반환
        return -1;
    }
}
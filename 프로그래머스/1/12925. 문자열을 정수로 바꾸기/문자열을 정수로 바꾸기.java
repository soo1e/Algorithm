class Solution {
    public int solution(String s) {
        int answer = 0;
        // 부호를 저장할 변수
        int sign = 1;
        
        // 문자열의 첫 번째 문자가 부호인 경우
        if (s.charAt(0) == '-') {
            // 부호를 음수로 설정
            sign = -1;
            // 부호를 제외한 숫자 부분을 파싱하여 정수로 변환
            answer = Integer.parseInt(s.substring(1));
        } else if (s.charAt(0) == '+') {
            // 부호를 제외한 숫자 부분을 파싱하여 정수로 변환
            answer = Integer.parseInt(s.substring(1));
        } else {
            // 부호 없이 문자열을 정수로 변환
            answer = Integer.parseInt(s);
        }
        
        // 부호를 곱하여 최종 결과 반환
        return sign * answer;
    }
}

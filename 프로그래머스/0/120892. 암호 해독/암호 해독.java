class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        // 문자열 cipher의 각 문자를 탐색하여 code의 배수 번째 문자를 answer에 추가합니다.
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        
        return answer;
    }
}

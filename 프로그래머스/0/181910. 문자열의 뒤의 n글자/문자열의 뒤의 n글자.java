class Solution {
    public String solution(String my_string, int n) {
        // 문자열 my_string의 길이
        int length = my_string.length();
        
        // 뒤에서부터 n글자 추출
        String answer = my_string.substring(length - n);
        
        return answer;
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if (length % 2 == 0) { // 짝수 길이인 경우
            int mid = length / 2;
            answer = s.substring(mid - 1, mid + 1); // 가운데 두 글자 반환
        } else { // 홀수 길이인 경우
            int mid = length / 2;
            answer = s.substring(mid, mid + 1); // 가운데 한 글자 반환
        }
        return answer;
    }
}
